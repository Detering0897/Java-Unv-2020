package Ex7.Point2;

public class Shepherd extends Dog{

    Shepherd(String nameIn, String colorIn, int leg) {
        super(nameIn, colorIn, leg);
    }

    @Override
    public String toString() {
        return "Shepherd's name:" + getName() + " its big " +
                getColor() + " with long " + getLeg_lenght() + " santimeters legs";
    }
}
