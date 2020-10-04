package Ex8.point2;

import Ex8.Point1.WidgetClass;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class VidjetClass extends JFrame {
    //img = addImage("image.png");
    static JLabel l;
    VidjetClass() throws IOException {
        super("Window");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        JLayeredPane lp = getLayeredPane();
        l = new JLabel("panel label");
        BufferedImage image = ImageIO.read(new File("C:\\Users\\Admin\\Downloads\\131e85892a4f50e8b6828d734e2d39ac.jpg"));
        JLabel label = new JLabel(new ImageIcon(image ));
        l.add(label);
        setSize(500, 500);
        setVisible(true);
    }


    public static void main(String[] args) throws IOException {
        JFrame.setDefaultLookAndFeelDecorated(true);
        new VidjetClass();
    }
}
