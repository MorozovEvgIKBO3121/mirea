package lab8;

import java.awt.Graphics;
import java.awt.Image;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Test extends JPanel {


    private static final int HEIGHT = 300;
    private static final int WIDTH = 500;

    private JFrame frame;
    private Timer timer;
    private Image image;
    public Test() {
        frame = new JFrame("MyAnimation");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(WIDTH, HEIGHT);
        frame.add(this);
        frame.setVisible(true);
        image =  new ImageIcon("src/1.png").getImage();
        count = 0;
        timer = new Timer();
        timer.schedule(animate, 1,200);
    }

    private int count;
    TimerTask animate = new TimerTask() {

        @Override
        public void run() {
            switch (count) {
                case 0:
                    image = new ImageIcon("src/2.png").getImage();
                    break;
                case 1:
                    image = new ImageIcon("src/1.png").getImage();
                    break;
                default:
                    break;
            }
            count++;
            if (count == 5) {
                count = 0;
            }
            repaint();
        }
    };

    public void paint(Graphics canvas) {
        canvas.drawImage(image, 150, 50,  null);
    }

}