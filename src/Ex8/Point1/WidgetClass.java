package Ex8.Point1;
import Ex8.Point1.Rectangle;
import Ex8.Point1.Shape;

import javax.swing.*;
import java.util.Random;

public class WidgetClass extends JFrame{
    public WidgetClass()
    {

        super("Window");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        JLayeredPane lp = getLayeredPane();

        //int a = (int)Math.random() * 10;
        Random r = new Random();
        for (int i =0;i<20;++i) {
            Shape figure = new Rectangle(40, 40, "red", false);
            int x1 = r.nextInt() % 350;
            x1 += 100;
            int x2 = r.nextInt() % 350;
            x2 += 100;

            int a = r.nextInt() % 50;
            a += 40;
            int b = r.nextInt() % 50;
            b += 40;
            figure.setBounds(x1, x2, a, b);
            figure.repaint();
            lp.add(figure, JLayeredPane.PALETTE_LAYER);


        }
        setSize(500, 500);
        setVisible(true);
    }
    public static void main(String[] arg) {

        JFrame.setDefaultLookAndFeelDecorated(true);
        new WidgetClass();
    }
}
