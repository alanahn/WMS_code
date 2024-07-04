package JavaGuiGame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class QuizGame extends JFrame {
    private JLabel questionLabel; // 질문을 표시할 레이블
    private JTextField answerField; // 사용자가 답을 입력할 텍스트 필드
    private JButton submitButton; // 답을 제출할 버튼
    private JLabel feedbackLabel; // 정답 여부를 표시할 피드백 레이블
    private String correctAnswer = "4"; // 정답을 저장하는 변수

    public QuizGame() {
        // GUI 컴포넌트 초기화
        questionLabel = new JLabel("2 + 2는 무엇일까요?"); // 질문 레이블 초기화
        answerField = new JTextField(10); // 텍스트 필드 초기화, 열 개수 10
        submitButton = new JButton("확인"); // 버튼 초기화
        feedbackLabel = new JLabel(""); // 피드백 레이블 초기화

        // 레이아웃 설정 (FlowLayout 사용)
        setLayout(new FlowLayout());

        // 컴포넌트 추가
        add(questionLabel); // 질문 레이블 추가
        add(answerField); // 텍스트 필드 추가
        add(submitButton); // 버튼 추가
        add(feedbackLabel); // 피드백 레이블 추가

        // 버튼에 이벤트 리스너 추가
        submitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                checkAnswer(); // 버튼 클릭 시 checkAnswer 메서드 호출
            }
        });

        // JFrame 설정
        setTitle("Quiz Game"); // 창 제목 설정
        setSize(300, 150); // 창 크기 설정
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 닫기 버튼 클릭 시 프로그램 종료
        setVisible(true); // 창을 화면에 표시
    }

    // 답 확인 메서드
    private void checkAnswer() {
        String userAnswer = answerField.getText(); // 텍스트 필드에서 사용자가 입력한 답 가져오기
        if (userAnswer.equals(correctAnswer)) { // 사용자의 답이 정답과 같은지 확인
            feedbackLabel.setText("정답입니다!"); // 정답일 경우 피드백 레이블에 메시지 설정
        } else {
            feedbackLabel.setText("오답입니다. 다시 시도하세요."); // 오답일 경우 피드백 레이블에 메시지 설정
        }
    }

    public static void main(String[] args) {
        new QuizGame(); // QuizGame 객체 생성 및 실행
    }
}
