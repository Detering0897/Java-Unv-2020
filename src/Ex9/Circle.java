package Ex9;

import java.awt.*;
import java.util.Random;

public class Circle extends Shape
{
    private double radius = 0;

    public Circle(String in_color, boolean in_filled) {
        super(in_color, in_filled);
    }


    public double getRadius()
    {
        return radius;
    }

    public void setRadius(double in_radius)
    {
        radius = in_radius;
    }

    public double getArea()
    {
        return Math.PI * radius * radius;
    }
    public double getPerimeter()
    {
        return 2 * Math.PI + radius;
    }
    public String toString()
    {
        return "Circle, radius: " + radius +
                ", color: " + color + ", filled: " + filled;
    }
    public void paintComponent(Graphics g)
    {
        randcol();
        x = Math.random() * 20 + 10;
        y = Math.random() * 20 + 10;
        radius = Math.random() * 5 ;

        Random rand = new Random();
        g.setColor(new Color(rand.nextFloat(), rand.nextFloat(), rand.nextFloat()));

        g.fillOval(0, 0, 90, 90);
    }
}
