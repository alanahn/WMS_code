package JavaGuiGame;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.LinkedList;
import java.util.Timer;

public class SnakeGame {
    static class MyFrame extends JFrame {

        //게임에서 사용할 변수
        static class XY {
            int x;
            int y;

            public XY(int x, int y) {
                this.x = x;
                this.y = y;
            }
        }

        static JPanel panelNorth;
        static JPanel panelCenter;
        static JLabel labelTitle;
        static JLabel labelMessage;
        static JPanel[][] panels = new JPanel[20][20];
        static int[][] map = new int[20][20];
        static LinkedList<XY> snake = new LinkedList<>();
        static int dir = 3; // 움직임 방향 0 : up, 1 down, 2 left, 3 right
        static int score = 0;
        static int time = 0; //게임 시간
        static int timeTickCount = 0; // per 200ms
        static Timer timer = null;

        //생성자
        public MyFrame(String title) {
            //JFrame class 에 타이틀 지정
            super(title);
            this.setSize(400, 500); //사이즈 지정
            this.setVisible(true); //윈도우 창 보이기
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //종료 버튼 활성

            initUI();
            // makeSnakeList();
            // startTimer();
            // setKeyListener();
            // makeFruit();
        }

        private void initUI() {
            this.setLayout(new BorderLayout());

            panelNorth = new JPanel();
            panelNorth.setPreferredSize(new Dimension(400, 100));
            panelNorth.setBackground(Color.BLACK);
            panelNorth.setLayout(new FlowLayout());

            labelTitle = new JLabel("Score: 0, Time: 0Sec");
            labelTitle.setPreferredSize(new Dimension(400, 50));
            labelTitle.setFont(new Font("timesRoman", Font.BOLD, 20));
            labelTitle.setForeground(Color.WHITE);
            labelTitle.setHorizontalAlignment(JLabel.CENTER);
            panelNorth.add(labelTitle);

            labelMessage = new JLabel("Eat Fruit!");
            labelMessage.setPreferredSize(new Dimension(400, 20));
            labelMessage.setFont(new Font("timesRoman", Font.BOLD, 20));
            labelMessage.setForeground(Color.YELLOW);
            labelMessage.setHorizontalAlignment(JLabel.CENTER);
            panelNorth.add(labelMessage);

            this.add(panelNorth);

            //여기서부터 추가하기 / 22분 40초 
        }
    }

    public static void main(String[] args) {
        new MyFrame("SnakeGame");
    }
}
