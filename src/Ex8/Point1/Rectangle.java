package Ex8.Point1;

import java.awt.*;
import java.util.Random;

public class Rectangle extends Shape
{
    protected double width = 0;
    protected double length = 0;

    public Rectangle(double in_width, double in_length,
                     String in_color, boolean in_filled)
    {
        super(in_color,in_filled);
        width = in_width;
        length = in_length;
    }

    public double get_Width()
    {
        return width;
    }

    public void setWidth(double in_width)
    {
        width = in_width;
    }

    public double getLength()
    {
        return length;
    }
    public void setLength(double in_length)
    {
        length = in_length;
    }

    public double getArea()
    {
        return length * width;
    }
    public double getPerimeter()
    {
        return length + length + width + width;
    }
    public String toString()
    {
        return "Rectangle, width: " + width + ", length: " + length +
                "color: " + color + "filled: " + filled;
    }
    public void paintComponent(Graphics g)
    {
        //randcol();
        x = Math.random() * 2000 + 10;
        y = Math.random() * 2000 + 40;
        width = Math.random() * 100 ;
        length = Math.random() * 100;
        x = 80;
        y = 80;
        Random rand = new Random();

        g.setColor(new Color(rand.nextFloat(), rand.nextFloat(), rand.nextFloat()));
        g.fillRect(0, 0, 130, 80);
    }
}
