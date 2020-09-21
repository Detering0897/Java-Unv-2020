package Ex6;


public class Rectangle extends Shape
{
    protected double width = 0;
    protected double length = 0;

    public Rectangle(double in_width, double in_length, String in_color, boolean in_filled)
    {
        super(in_color,in_filled);
        width = in_width;
        length = in_length;
    }

    public double getWidth()
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
}
