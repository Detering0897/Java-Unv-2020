package Ex7.Point2;

public class TestClass {
    public static void main(String[] arg)
    {

        Shepherd fir = new Shepherd("Robert","Black", 20);
        Chihuahua sec = new Chihuahua("Jolly","Pale", 8);
        System.out.println( fir.toString());
        System.out.println(sec.toString());
    }
}
