package lab11;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;

public class FontText3 {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Изменить шрифт и цвет текста");

        JPanel panel = (JPanel) jFrame.getContentPane();
        panel.setLayout(null);

        JLabel portText = new JLabel("Введите текст: ");
        JTextField port = new JTextField(20);

        portText.setBounds(150, 80, 100, 10);
        panel.add(portText);
        port.setBounds(250, 70, 150, 30);
        port.setText("Пример текста");
        panel.add(port);

        JMenuBar jMenuBar = new JMenuBar();

        JMenu menuText = new JMenu("Шрифт");
        JMenu menuColor = new JMenu("Цвет");

        menuColor.add(new JMenuItem("BLUE")).addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                port.setForeground(Color.BLUE);
            }
        });
        menuColor.add(new JMenuItem("DARK_GRAY")).addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                port.setForeground(Color.DARK_GRAY);
            }
        });
        menuColor.add(new JMenuItem("RED")).addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                port.setForeground(Color.RED);
            }
        });

        menuText.add(new JMenuItem("Italic")).addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Font font = new Font("ITALIC", Font.ITALIC, 18);
                port.setFont(font);
            }
        });
        menuText.add(new JMenuItem("Arial")).addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Font font2 = new Font("Arial", Font.BOLD + Font.ITALIC, 16);
                port.setFont(font2);
            }
        });
        menuText.add(new JMenuItem("TimesRoman")).addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Font font3 = new Font("TimesRoman", Font.BOLD, 18);
                port.setFont(font3);
            }
        });

        jMenuBar.add(menuText);
        jMenuBar.add(menuColor);

        jFrame.setJMenuBar(jMenuBar);
        jFrame.revalidate();

        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setBounds(750, 250, 500, 300);
        jFrame.setVisible(true);
    }
}
