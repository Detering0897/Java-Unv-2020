package Ex8.point2;

import javax.swing.*;
import java.awt.*;

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



class WidgetClass extends JFrame
{
    WidgetClass()
    {
        setContentPane(new Shower("C:\\Users\\Admin\\Downloads\\131e85892a4f50e8b6828d734e2d39ac.jpg"));
    }
    public static void main(String[] argv)
    {
        WidgetClass myFrame = new WidgetClass();
        myFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        Graphics gr = myFrame.getGraphics();
        myFrame.paintComponents(gr);
        myFrame.pack();
        myFrame.setVisible(true);
    }
}