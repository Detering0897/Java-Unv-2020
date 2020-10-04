package Ex8.point3;



import java.awt.*;
import javax.swing.*;

/*
import java.awt.*;
import java.awt.image.*;
import javax.swing.*;
import java.util.Timer;
import java.util.TimerTask;

public class WidgetClass extends JFrame {

    ImageIcon icon1 = new ImageIcon("C:\\Users\\nikol\\Pictures\\Screenshots\\Снимок экрана (1).png");
    ImageIcon icon2 = new ImageIcon("C:\\Users\\nikol\\Pictures\\Screenshots\\12.png");
    Image im1 = icon1.getImage();
    Image im2 = icon2.getImage();

    BufferedImage dest;

    float sourcePercentage = 1, destinationPercentage = 0;
    private static int STEPS = 100;
    private static float STEP_CHANGE = 1.0f / STEPS;
    private static int SLEEP_DELAY = 50;

    public WidgetClass() {
        super("Image Blending");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        dest = new BufferedImage(800, 700, BufferedImage.TYPE_INT_ARGB);
        setSize(800, 540);
        TimerTask task = new TimerTask() {
            public void run() {
                repaint();
                sourcePercentage -= STEP_CHANGE;
                destinationPercentage += STEP_CHANGE;
            }
        };
        Timer timer = new Timer();
        timer.schedule(task, 0, SLEEP_DELAY);
    }

    public void paint(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        Graphics2D destG = dest.createGraphics();
        destG.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC,sourcePercentage));
        destG.drawImage(im1, 0, 0, this);
        destG.setComposite(AlphaComposite.getInstance(AlphaComposite.XOR,destinationPercentage));
        destG.drawImage(im2, 0, 0, this);
        g2d.drawImage(dest, 0, 0, this);
    }

    public static void main(String args[]) {
        new WidgetClass().show();
    }
}*/

class Shower extends JPanel
{
    private Image image;

    Shower(String adres)
    {
        image = getToolkit().getImage(adres);
        setPreferredSize(new Dimension(1290, 820));
    }

    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        g.drawImage(image, 5, 5, this);
    }
}

public class WidgetClass extends JFrame {

    WidgetClass(){
        setContentPane(new Shower("C:\\Users\\Admin\\Downloads\\131e85892a4f50e8b6828d734e2d39ac.jpg"));
    }
    public static void main(String args[]) {
        WidgetClass myFrame1 = new WidgetClass();
        myFrame1.setDefaultCloseOperation(EXIT_ON_CLOSE);
        Graphics gr = myFrame1.getGraphics();
        myFrame1.paintComponents(gr);
        myFrame1.pack();
        myFrame1.setVisible(true);
        WidgetClass myFrame2 = new WidgetClass();
        myFrame2.setDefaultCloseOperation(EXIT_ON_CLOSE);
        myFrame2.paintComponents(gr);
        myFrame2.pack();
        myFrame2.setVisible(true);
        WidgetClass myFrame3 = new WidgetClass();
        myFrame3.setDefaultCloseOperation(EXIT_ON_CLOSE);
        myFrame3.paintComponents(gr);
        myFrame3.pack();
        myFrame3.setVisible(true);
        WidgetClass myFrame4 = new WidgetClass();
        myFrame4.setDefaultCloseOperation(EXIT_ON_CLOSE);
        myFrame4.paintComponents(gr);
        myFrame4.pack();
        myFrame4.setVisible(true);
    }
}