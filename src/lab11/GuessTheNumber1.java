package lab11;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static java.lang.Math.random;


class GuessTheNumber1{

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Guess the number");

        JPanel panel = (JPanel) jFrame.getContentPane();
        panel.setLayout(null);

        JLabel portText = new JLabel("Введите число: ");
        JTextField port = new JTextField(20);
        JButton button1 = new JButton("try");
        JLabel label = new JLabel("");

        label.setBounds(150 / 2 - 50, 70, 200, 10);
        panel.add(label);

        portText.setBounds(150 / 2 - 50, 20, 100, 10);
        panel.add(portText);
        port.setBounds(150 / 2 - 50, 40, 100, 30);
        panel.add(port);

        button1.setBounds(360 / 2 - 50, 40, 100, 30);
        panel.add(button1);

        final int[] counter = {0};
        int a = (int) (random()*20);
        System.out.println(a);
        final int[] winNumber = {a};
        port.getText();

        ActionListener AListener1 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int number = Integer.parseInt(port.getText());
                if (number > winNumber[0]){
                    label.setText("Неверно, число меньше");
                    counter[0]++;
                }
                if (number < winNumber[0]){
                    label.setText("Неверно, число больше");
                    counter[0]++;
                }
                if (number == winNumber[0]){
                    label.setText("You win!");
                    counter[0] = 0;
                }
                if (counter[0] == 3){
                    label.setText("Game over.");
                    counter[0] = 0;
                }
                }
        };


        button1.addActionListener(AListener1);

        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setBounds(750, 250, 350, 180);
        jFrame.setVisible(true);

    }
}