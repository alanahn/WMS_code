package JavaGuiGame;

import javax.swing.JFrame;

public class Game extends JFrame {
    public Game() {
        add(new GameBoard()); // 게임 보드 패널 추가
        setTitle("Snake Game"); // 창 제목 설정
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 닫기 버튼 설정
        setResizable(false); // 창 크기 조절 불가 설정
        pack(); // 패널 크기에 맞춰 창 크기 조절
        setLocationRelativeTo(null); // 창을 화면 중앙에 위치
    }

    public static void main(String[] args) {
        JFrame frame = new Game();
        frame.setVisible(true); // 창을 표시
    }
}
