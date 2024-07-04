package JavaGuiGame;

import javax.swing.JPanel;
import javax.swing.Timer;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class GameBoard extends JPanel implements ActionListener {
    private final int B_WIDTH = 300; // 보드 가로 크기
    private final int B_HEIGHT = 300; // 보드 세로 크기
    private final int DOT_SIZE = 10; // 도트(스네이크와 사과) 크기
    private final int ALL_DOTS = 900; // 보드 전체에 놓일 수 있는 최대 도트 수
    private final int RAND_POS = 29; // 랜덤 위치 계산용
    private final int DELAY = 140; // 타이머 딜레이 (ms)

    private final int x[] = new int[ALL_DOTS]; // x 좌표 배열
    private final int y[] = new int[ALL_DOTS]; // y 좌표 배열

    private int dots; // 현재 도트 수 (스네이크 길이)
    private int apple_x; // 사과 x 좌표
    private int apple_y; // 사과 y 좌표

    private boolean leftDirection = false; // 왼쪽 이동 방향 플래그
    private boolean rightDirection = true; // 오른쪽 이동 방향 플래그
    private boolean upDirection = false; // 위쪽 이동 방향 플래그
    private boolean downDirection = false; // 아래쪽 이동 방향 플래그
    private boolean inGame = true; // 게임 상태 플래그

    private Timer timer; // 타이머
    private Image ball; // 스네이크 몸통 이미지
    private Image apple; // 사과 이미지
    private Image head; // 스네이크 머리 이미지

    public GameBoard() {
        initBoard();
    }

    private void initBoard() {
        addKeyListener(new TAdapter()); // 키 리스너 추가
        setBackground(Color.WHITE); // 배경색 설정
        setFocusable(true); // 키 이벤트 수신 가능 설정

        setPreferredSize(new Dimension(B_WIDTH, B_HEIGHT)); // 패널 크기 설정
        loadImages(); // 이미지 로드
        initGame(); // 게임 초기화
    }

    private void loadImages() {
        ball = Toolkit.getDefaultToolkit().createImage("images/26.jpg");
        apple = Toolkit.getDefaultToolkit().createImage("images/body.jpg");
        head = Toolkit.getDefaultToolkit().createImage("images/head.jpg");
        System.out.println("이미지 로드 완료");
    }

    private void initGame() {
        dots = 3; // 초기 스네이크 길이 설정

        // 스네이크 초기 위치 설정
        for (int z = 0; z < dots; z++) {
            x[z] = 50 - z * DOT_SIZE;
            y[z] = 50;
        }

        locateApple(); // 사과 위치 설정

        timer = new Timer(DELAY, this); // 타이머 설정
        timer.start(); // 타이머 시작
        System.out.println("게임 초기화 완료");
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g); // 패널 그리기

        doDrawing(g); // 도형 그리기
    }

    private void doDrawing(Graphics g) {
        if (inGame) {
            g.drawImage(apple, apple_x, apple_y, this); // 사과 그리기

            // 스네이크 그리기
            for (int z = 0; z < dots; z++) {
                if (z == 0) {
                    g.drawImage(head, x[z], y[z], this); // 머리 그리기
                } else {
                    g.drawImage(ball, x[z], y[z], this); // 몸통 그리기
                }
            }

            // Toolkit.getDefaultToolkit().sync(); // 그래픽 동기화

        } else {
            System.out.println("doDrawing 실패");
            // gameOver(g); // 게임 오버 화면 그리기
        }
    }

    private void gameOver(Graphics g) {
        String msg = "Game Over";
        Font small = new Font("Helvetica", Font.BOLD, 14);
        FontMetrics metr = getFontMetrics(small);

        g.setColor(Color.white); // 텍스트 색상 설정
        g.setFont(small); // 폰트 설정
        g.drawString(msg, (B_WIDTH - metr.stringWidth(msg)) / 2, B_HEIGHT / 2); // 텍스트 그리기
    }

    private void checkApple() {
        if ((x[0] == apple_x) && (y[0] == apple_y)) {
            dots++; // 사과 먹으면 스네이크 길이 증가
            locateApple(); // 새로운 사과 위치 설정
        }
    }

    private void move() {
        // 스네이크 몸통 이동
        for (int z = dots; z > 0; z--) {
            x[z] = x[(z - 1)];
            y[z] = y[(z - 1)];
        }

        // 방향에 따른 머리 이동
        if (leftDirection) {
            x[0] -= DOT_SIZE;
        }

        if (rightDirection) {
            x[0] += DOT_SIZE;
        }

        if (upDirection) {
            y[0] -= DOT_SIZE;
        }

        if (downDirection) {
            y[0] += DOT_SIZE;
        }
    }

    private void checkCollision() {
        // 스네이크 자기 자신과 충돌 검사
        for (int z = dots; z > 0; z--) {
            if ((z > 4) && (x[0] == x[z]) && (y[0] == y[z])) {
                inGame = false;
            }
        }

        // 보드 경계와 충돌 검사
        if (y[0] >= B_HEIGHT) {
            inGame = false;
        }

        if (y[0] < 0) {
            inGame = false;
        }

        if (x[0] >= B_WIDTH) {
            inGame = false;
        }

        if (x[0] < 0) {
            inGame = false;
        }

        if (!inGame) {
            timer.stop();
        }
    }

    private void locateApple() {
        // 사과의 랜덤 위치 설정
        int r = (int) (Math.random() * RAND_POS);
        apple_x = r * DOT_SIZE;

        r = (int) (Math.random() * RAND_POS);
        apple_y = r * DOT_SIZE;
        System.out.println("사과 위치 설정 완료");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (inGame) {
            checkApple(); // 사과 먹기 확인
            checkCollision(); // 충돌 검사
            move(); // 스네이크 이동
        }

        repaint(); // 패널 다시 그리기
    }

    private class TAdapter extends KeyAdapter {
        @Override
        public void keyPressed(KeyEvent e) {

            int key = e.getKeyCode();

            // 방향키 입력에 따라 이동 방향 설정
            if ((key == KeyEvent.VK_LEFT) && (!rightDirection)) {
                leftDirection = true;
                upDirection = false;
                downDirection = false;
            }

            if ((key == KeyEvent.VK_RIGHT) && (!leftDirection)) {
                rightDirection = true;
                upDirection = false;
                downDirection = false;
            }

            if ((key == KeyEvent.VK_UP) && (!downDirection)) {
                upDirection = true;
                rightDirection = false;
                leftDirection = false;
            }

            if ((key == KeyEvent.VK_DOWN) && (!upDirection)) {
                downDirection = true;
                rightDirection = false;
                leftDirection = false;
            }
        }
    }
}
