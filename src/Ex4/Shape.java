package Ex4;

public abstract class Shape {
    protected String color = "not color";
    protected boolean filled = false;

    public Shape()
    {
    }
    public Shape(String in_color, boolean in_filled)
    {
        this.color = in_color;
        this.filled = in_filled;
    }

    public String getColor()
    {
        return color;
    }

    public void setColor(String in_color)
    {
        this.color = in_color;
    }

    public boolean isFilled()
    {
        return filled;
    }

    public void setFilled(boolean in_filled)
    {
        this.filled = in_filled;
    }

    public abstract double getArea();
    public abstract double getPerimeter();
    public abstract String toString();

}
