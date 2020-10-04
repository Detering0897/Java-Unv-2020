package Ex7.Point2;

public abstract class Dog {
    private String name = "";
    private String color = "";
    private int leg_lenght = 10;

    Dog (String nameIn,String colorIn, int leg) {
        name = nameIn;
        color = colorIn;
        leg_lenght = leg;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLeg_lenght(int leg_lenght) {
        this.leg_lenght = leg_lenght;
    }

    public String getColor() {
        return color;
    }

    public String getName() {
        return name;
    }

    public int getLeg_lenght() {
        return leg_lenght;
    }
    public abstract String toString();
}
