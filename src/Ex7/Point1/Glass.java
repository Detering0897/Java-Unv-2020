package Ex7.Point1;

public class Glass extends  Dish{

    Glass(boolean clean_in, boolean wet_in) {
        super("Glass", clean_in, wet_in);
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
        return "Glass made of:" + material + " washed:" + clean + " wet:"+wet;
    }
}
