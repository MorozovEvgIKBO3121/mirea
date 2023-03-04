package lab8;

import org.w3c.dom.Node;
import javax.imageio.*;
import javax.imageio.metadata.*;
import javax.imageio.stream.ImageOutputStream;
import javax.swing.*;
import java.awt.*;
import java.awt.image.*;
import java.util.List;
import java.util.ArrayList;
import java.io.*;

public class MyImage2 {
    public static void main(String[] args) throws Exception {
        java.util.List<GifFrame> gifFrames = new ArrayList<GifFrame>();
        for(int i=0; i<args.length-1; i++) {
            BufferedImage image = ImageIO.read(new File(args[i]));
            int transparantColor = 0xFF00FF; // purple
            BufferedImage gif = ImageUtil.convertRGBAToGIF(image, transparantColor);
            long delay = 1000; // every frame takes 1s
            String disposal = GifFrame.RESTORE_TO_BGCOLOR; // make transparent pixels not 'shine through'
            gifFrames.add(new GifFrame(gif, delay, disposal));
        }
        OutputStream outputStream = new FileOutputStream(new File(args[args.length - 1]));

        int loopCount = 0; // loop indefinitely
        ImageUtil.saveAnimatedGIF(outputStream, gifFrames, loopCount);
        JFrame frame = new JFrame("My image");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800,800);
        frame.setVisible(true);
    }
}
