package Ex7.Point1;

public class Plate extends Dish {


    Plate( boolean clean_in, boolean wet_in) {
        super("Ceramic", clean_in, wet_in);
    }

    @Override
    public void use() {
        if (clean)
            setClean(false);
    }

    @Override
    public void wash() {
        if (!clean) {
            setClean(true);
            setWet(true);
        }
    }

    @Override
    public void dry() {
        if (wet) {
            setWet(false);
        }
    }
    @Override
    public String toString() {
        return "Plate made of:" + material + " washed:" + clean + " wet:"+wet;
    }
}
