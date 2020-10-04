package Ex8.Point1;
//import javax.swing.JFrame;

import javax.swing.*;
import java.awt.*;

public abstract class Shape extends JComponent {
    protected String color = "not color";
    protected boolean filled = false;
    protected double x = 0.0;
    protected double y = 0.0;

    public Shape(String in_color, boolean in_filled) {
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

    public double get_X() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double get_Y() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void randcol()
    {
        double a = Math.random()*3;
        int n = (int) a;
        switch (n){
            case 0:color = "yellow"; break;
            case 1:color = "black"; break;
            case 2:color = "red"; break;
            default: break;
    }
    }
    public abstract void paintComponent(Graphics g);
    public abstract double getArea();
    public abstract double getPerimeter();
    public abstract String toString();

}

