package lab11;


import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class DialogWindow2 {
        static JFrame jFrame = getFrame();

    public static void main(String[] args) throws Exception{
        JComponent jComponent = new MyComponent();
        jFrame.add(jComponent);
        jFrame.addMouseMotionListener(new MouseAdapter() {
            @Override
            public void mouseMoved(MouseEvent e) {
                super.mouseMoved(e);
                MyComponent.xCoord = e.getX();
                MyComponent.yCoord = e.getY();
                jComponent.repaint();
            }
        });
    }

    static class MyComponent extends JComponent {
    public static int xCoord;
    public static int yCoord;
    @Override
        protected void paintComponent(Graphics g){
        super.paintComponent(g);
        ((Graphics2D) g).drawString("Coordenates x: " + xCoord + " y: " + yCoord, 10, 30);
        if (yCoord < 200 && xCoord > 230 && xCoord < 460) {
            ((Graphics2D) g).drawString("Добро пожаловать на север", 250, 50);
        }
        if (yCoord > 200 && yCoord < 400 && xCoord > 230 && xCoord < 460) {
            ((Graphics2D) g).drawString("Добро пожаловать в центр", 250, 300);
        }
        if (yCoord > 400 && xCoord > 230 && xCoord < 460) {
            ((Graphics2D) g).drawString("Добро пожаловать на юг", 250, 500);
        }
        if (xCoord < 230) {
            ((Graphics2D) g).drawString("Добро пожаловать на запад", 20, 300);
        }
        if (xCoord > 460) {
            ((Graphics2D) g).drawString("Добро пожаловать на восток", 500, 300);
        }
    }
    }


    static JFrame getFrame(){
    JFrame jFrame = new JFrame() {};
    jFrame.setVisible(true);
    jFrame.setBounds(750,250,690,600);
    jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    return jFrame;
    }
}
