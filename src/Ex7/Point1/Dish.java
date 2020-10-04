package Ex7.Point1;

public abstract class Dish {
    protected String material = "no";
    protected boolean clean = true;
    protected boolean wet = false;

    Dish (String mat,boolean clean_in,boolean wet_in){
        material = mat;
        clean = clean_in;
        wet = wet_in;
    }

    public void setClean(boolean cleaned) {
        this.clean = cleaned;
    }

    public void setWet(boolean wet) {
        this.wet = wet;
    }

    public String getMaterial() {
        return material;
    }

    public boolean isClean() {
        return clean;
    }

    public boolean isWet() {
        return wet;
    }
    public abstract String toString();
    public abstract void use();
    public abstract void wash();
    public abstract void dry();
}
