package Ex4;

public class Square extends Rectangle {


    public Square(double in_width, double in_length, String in_color, boolean in_filled) {
        super(in_width, in_length, in_color, in_filled);
    }

    public double getSide()
    {
        return width;
    }

    public void setSide(double in_side)
    {
        width = in_side;
        length = in_side;
    }

    public String toString()
    {
        return "Square, length: " + length +
                "color: " + color + "filled: " + filled;
    }

}
