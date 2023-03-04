package lab8;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

class MyImage3 extends JComponent implements KeyListener, ActionListener {
    public static void main(String[] args){
        JFrame frame = new JFrame("ImageAnimation");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800,800);
        JLabel header = new JLabel(new ImageIcon(args[0]));
        JLabel header3 = new JLabel(new ImageIcon(args[2]));
        frame.add(header3);
        frame.add(header);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}