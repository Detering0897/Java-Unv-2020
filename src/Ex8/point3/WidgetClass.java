package Ex8.point3;
import javax.swing.*;
import java.awt.*;
import java.util.concurrent.TimeUnit;

class Shower extends JPanel
{
    private Image image;

    Shower(String adres)
    {
        image = getToolkit().getImage(adres);
        setPreferredSize(new Dimension(500, 500));
    }

    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        g.drawImage(image, 5, 5, this);
    }
}



class WidgetClass extends JFrame
{
    WidgetClass()
    {
        setContentPane(new Shower("C:\\Users\\Admin\\Desktop\\PRG\\pic\\1.jpg"));
    }
    public static void main(String[] argv) throws InterruptedException {
        WidgetClass myFrame = new WidgetClass();
        myFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        Graphics gr = myFrame.getGraphics();
        myFrame.paintComponents(gr);
        myFrame.pack();
        myFrame.setVisible(true);
        TimeUnit.SECONDS.sleep(1);
        myFrame.setContentPane(new Shower("C:\\Users\\Admin\\Desktop\\PRG\\pic\\2.jpg"));
        gr = myFrame.getGraphics();
        myFrame.paintComponents(gr);
        TimeUnit.SECONDS.sleep(1);
        myFrame.setContentPane(new Shower("C:\\Users\\Admin\\Desktop\\PRG\\pic\\3.jpg"));
        gr = myFrame.getGraphics();
        myFrame.paintComponents(gr);
        TimeUnit.SECONDS.sleep(1);
        myFrame.setContentPane(new Shower("C:\\Users\\Admin\\Desktop\\PRG\\pic\\4.jpg"));
        gr = myFrame.getGraphics();
        myFrame.paintComponents(gr);
        TimeUnit.SECONDS.sleep(1);
        myFrame.setContentPane(new Shower("C:\\Users\\Admin\\Desktop\\PRG\\pic\\5.jpg"));
        gr = myFrame.getGraphics();
        myFrame.paintComponents(gr);
        TimeUnit.SECONDS.sleep(1);
        myFrame.setContentPane(new Shower("C:\\Users\\Admin\\Desktop\\PRG\\pic\\6.jpg"));
        gr = myFrame.getGraphics();
        myFrame.paintComponents(gr);
        TimeUnit.SECONDS.sleep(1);
        myFrame.setContentPane(new Shower("C:\\Users\\Admin\\Desktop\\PRG\\pic\\7.jpg"));
        gr = myFrame.getGraphics();
        myFrame.paintComponents(gr);
    }
}