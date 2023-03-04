package lab11;

import javax.swing.*;
import javax.swing.JOptionPane;

public class Test3 {
    public static void main(String[] args) {


        JFrame jFrame = new JFrame("Dialog Window");

        String msg = "";
        int mouseX = 0, mouseY = 0; // координаты курсора мыши

        JPanel panel = (JPanel) jFrame.getContentPane();
        panel.setLayout(null);

        JLabel label = new JLabel("Dialog");
        JOptionPane.showMessageDialog(null, "Simple Information Message");

        label.setBounds(150 / 2 - 50, 40, 200, 40);
        panel.add(label);

        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setBounds(750, 250, 500, 200);
        jFrame.setVisible(true);

    }
}
