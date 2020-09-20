package Ex4;

public class Square extends Rectangle {
    Square() {}
    Square(double in_side)
    {
        width = in_side;
        length = in_side;
    }

    Square(double in_side, String in_color, boolean in_filled)
    {
        width = in_side;
        length = in_side;
        filled = in_filled;
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
