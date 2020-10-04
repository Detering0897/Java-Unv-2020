package Ex7.Point2;

public class Chihuahua extends  Dog{
    Chihuahua(String nameIn, String colorIn, int leg) {
        super(nameIn, colorIn, leg);
    }

    @Override
    public String toString() {
        return "Chihuahua's name:" + getName() + " its small " +
                getColor() + " with short " + getLeg_lenght() + " santimeters legs";
    }
}
