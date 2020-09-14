package Ex3;


class Circle{
    double rad = 10.0;
    public double get_rad() {return rad;}
    public void set_rad(double r) {rad = r;}
    public double get_P(){
        return rad*2*3.14;
    }
    public double get_S(){
        return rad*rad*3.14;
    }
}
class CircleTest{
    Circle circ;
    CircleTest () {
        circ.set_rad(15.0);
        System.out.println(circ.get_rad());
        System.out.println(circ.get_P());
        System.out.println(circ.get_S());
    }

}

public class Main {

    public static void main(String[] args) {
        //CircleTest n;
    }
}


