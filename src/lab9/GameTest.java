package lab9;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


class GameTest {

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Football fan");

        JPanel panel = (JPanel) jFrame.getContentPane();
        panel.setLayout(null);

        JLabel portText = new JLabel("Result: 0 X 0");
        JLabel portText2 = new JLabel("Last Scorer: N/A");
        JLabel portText3 = new JLabel("Winner: DRAW");
        JButton button1 = new JButton("Milan");
        JButton button2 = new JButton("Madrid");


        portText.setBounds(150 / 2 - 50, 20, 100, 10);
        panel.add(portText);

        portText2.setBounds(150 / 2 - 50, 40, 200, 10);
        panel.add(portText2);

        portText3.setBounds(150 / 2 - 50, 60, 100, 10);
        panel.add(portText3);

        button1.setBounds(500 / 2 - 50, 20, 100, 30);
        panel.add(button1);

        button2.setBounds(700 / 2 - 50, 20, 100, 30);
        panel.add(button2);

        final int[] i = {0};
        final int[] j = {0};

        ActionListener AListener1 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                i[0]++;
                if (i[0] % 5 == 0){
                    portText.setText("Result: " + i[0] + " X " + j[0]);
                    portText3.setText("Winner: Milan");
                    i[0] = 0;
                    j[0] = 0;
                    portText.setText("Result: " + i[0] + " X " + j[0]);
                }
                else {
                    portText2.setText("Last Scorer: Milan");
                    portText.setText("Result: " + i[0] + " X " + j[0]);
                }
            }
        };

        ActionListener AListener2 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                j[0]++;
                if (j[0] % 5 == 0){
                    portText.setText("Result: " + i[0] + " X " + j[0]);
                    portText3.setText("Winner: Madrid");
                    i[0] = 0;
                    j[0] = 0;
                    portText.setText("Result: " + i[0] + " X " + j[0]);
                }
                else {
                    portText2.setText("Last Scorer: Madrid");
                    portText.setText("Result: " + i[0] + " X " + j[0]);
                }
            }
        };

        button1.addActionListener(AListener1);
        button2.addActionListener(AListener2);

        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setBounds(750, 250, 500, 130);
        jFrame.setVisible(true);

    }
}