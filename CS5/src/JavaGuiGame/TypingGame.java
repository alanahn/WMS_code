package JavaGuiGame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class TypingGame extends JFrame {
    private JTextField inputField; // 사용자가 단어를 입력할 텍스트 필드
    private JLabel wordLabel, scoreLabel; // 화면에 표시될 단어와 점수를 표시할 레이블
    private JButton startButton, stopButton; // 게임 시작 및 종료 버튼
    private Timer timer; // 단어 갱신을 위한 타이머
    private String[] words = { "apple", "banana", "cherry", "date", "elderberry", "fig", "grape", "honeydew" }; // 단어 배열
    private int score = 0; // 점수 변수
    private Random random = new Random(); // 무작위 단어 선택을 위한 Random 객체

    public TypingGame() {
        // GUI 컴포넌트 초기화
        inputField = new JTextField(10);
        wordLabel = new JLabel("");
        scoreLabel = new JLabel("Score: 0");
        startButton = new JButton("Start");
        stopButton = new JButton("Stop");

        // 레이아웃 설정 (FlowLayout 사용)
        setLayout(new FlowLayout());

        // 컴포넌트 추가
        add(new JLabel("Type the word:")); // 설명 레이블 추가
        add(wordLabel); // 단어 레이블 추가
        add(inputField); // 입력 필드 추가
        add(startButton); // 시작 버튼 추가
        add(stopButton); // 종료 버튼 추가
        add(scoreLabel); // 점수 레이블 추가

        // 타이머 설정 (1초마다 단어를 갱신)
        timer = new Timer(2000, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                updateWord(); // 매초마다 새로운 단어로 갱신
            }
        });

        // 시작 버튼에 이벤트 리스너 추가
        startButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                startGame(); // 게임 시작
            }
        });

        // 종료 버튼에 이벤트 리스너 추가
        stopButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                stopGame(); // 게임 종료
            }
        });

        // 텍스트 필드에 이벤트 리스너 추가
        inputField.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                checkWord(); // 사용자가 단어 입력 후 Enter 키를 누르면 단어 확인
            }
        });

        // JFrame 설정
        setTitle("Typing Game"); // 창 제목 설정
        setSize(300, 200); // 창 크기 설정
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 닫기 버튼 클릭 시 프로그램 종료
        setVisible(true); // 창을 화면에 표시
    }

    // 게임 시작 메서드
    private void startGame() {
        score = 0; // 점수 초기화
        scoreLabel.setText("Score: " + score); // 점수 레이블 초기화
        updateWord(); // 새로운 단어 표시
        timer.start(); // 타이머 시작
    }

    // 게임 종료 메서드
    private void stopGame() {
        timer.stop(); // 타이머 정지
        wordLabel.setText(""); // 단어 레이블 초기화
    }

    // 단어 갱신 메서드
    private void updateWord() {
        String newWord = words[random.nextInt(words.length)]; // 무작위 단어 선택
        wordLabel.setText(newWord); // 단어 레이블 업데이트
    }

    // 단어 확인 메서드
    private void checkWord() {
        String typedWord = inputField.getText(); // 사용자가 입력한 단어 가져오기
        String displayedWord = wordLabel.getText(); // 화면에 표시된 단어 가져오기

        if (typedWord.equals(displayedWord)) { // 단어가 일치하는지 확인
            score++; // 점수 증가
            scoreLabel.setText("Score: " + score); // 점수 레이블 업데이트
            inputField.setText(""); // 입력 필드 초기화
            updateWord(); // 새로운 단어 표시
        }
    }

    public static void main(String[] args) {
        new TypingGame(); // TypingGame 객체 생성 및 실행
    }
}
