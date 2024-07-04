package JavaGuiGame;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class SwingExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Swing Example");
        JButton button = new JButton("Click Me");

        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Button Clicked");
            }
        });

        JPanel panel = new JPanel(new FlowLayout());
        panel.add(new JButton("Button 1"));
        panel.add(new JButton("Button 2"));

        JPanel panel2 = new JPanel(new BorderLayout());
        panel2.add(new JButton("North"), BorderLayout.NORTH);
        panel2.add(new JButton("South"), BorderLayout.SOUTH);
        panel2.add(new JButton("East"), BorderLayout.EAST);
        panel2.add(new JButton("West"), BorderLayout.WEST);
        panel2.add(new JButton("Center"), BorderLayout.CENTER);

        frame.add(button);
        frame.add(panel);
        frame.add(panel2);
        frame.setSize(300, 200);
        frame.setLayout(new FlowLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
