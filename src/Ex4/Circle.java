package Ex4;

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
}
