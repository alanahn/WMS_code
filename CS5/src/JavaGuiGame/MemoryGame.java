package JavaGuiGame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Collections;
import java.util.ArrayList;

public class MemoryGame extends JFrame {
    private JButton[] buttons = new JButton[16]; // 4x4 그리드의 버튼
    private String[] icons = {
            "🍎", "🍌", "🍒", "🍇", "🍉", "🍓", "🍍", "🥝", // 8쌍의 그림
            "🍎", "🍌", "🍒", "🍇", "🍉", "🍓", "🍍", "🥝"
    };
    private ArrayList<String> shuffledIcons = new ArrayList<>();
    private JButton firstButton, secondButton;
    private int pairsFound = 0;

    public MemoryGame() {
        // 아이콘 배열을 섞기
        Collections.addAll(shuffledIcons, icons);
        Collections.shuffle(shuffledIcons);

        // 레이아웃 설정 (GridLayout 사용)
        setLayout(new GridLayout(4, 4));

        // 버튼 초기화 및 추가
        for (int i = 0; i < 16; i++) {
            buttons[i] = new JButton("");
            buttons[i].setFont(new Font("Arial", Font.PLAIN, 24));
            buttons[i].addActionListener(new ButtonClickListener());
            add(buttons[i]);
        }

        // JFrame 설정
        setTitle("Memory Game");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    // 버튼 클릭 리스너
    private class ButtonClickListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            JButton clickedButton = (JButton) e.getSource();
            int index = findButtonIndex(clickedButton);

            if (firstButton == null) {
                firstButton = clickedButton;
                firstButton.setText(shuffledIcons.get(index));
            } else if (secondButton == null && clickedButton != firstButton) {
                secondButton = clickedButton;
                secondButton.setText(shuffledIcons.get(index));

                // 두 버튼이 일치하는지 확인
                if (shuffledIcons.get(findButtonIndex(firstButton))
                        .equals(shuffledIcons.get(findButtonIndex(secondButton)))) {
                    pairsFound++;
                    firstButton = null;
                    secondButton = null;

                    if (pairsFound == 8) {
                        JOptionPane.showMessageDialog(null, "Congratulations! You've found all pairs!");
                    }
                } else {
                    Timer timer = new Timer(500, new ActionListener() {
                        public void actionPerformed(ActionEvent e) {
                            firstButton.setText("");
                            secondButton.setText("");
                            firstButton = null;
                            secondButton = null;
                        }
                    });
                    timer.setRepeats(false);
                    timer.start();
                }
            }
        }
    }

    // 버튼 인덱스 찾기
    private int findButtonIndex(JButton button) {
        for (int i = 0; i < buttons.length; i++) {
            if (buttons[i] == button) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        new MemoryGame(); // MemoryGame 객체 생성 및 실행
    }
}
