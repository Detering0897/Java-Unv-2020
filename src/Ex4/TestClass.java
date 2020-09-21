package Ex4;

public class TestClass
{
    public static void main(String[] arg)
    {
        Shape s1 = new Circle(10, "Blue", false);
        System.out.println(s1);
        //System.out.println(s1.getArea());
        //System.out.println(s1.getPerimeter());
        //System.out.println(s1.getColor());
        //System.out.println(s1.isFilled());

        Circle c1 = (Circle)s1;
        System.out.println(c1);
        //System.out.println(c1.getArea());
        //System.out.println(c1.getPerimeter());
        //System.out.println(c1.getColor());
        //System.out.println(c1.isFilled());
        //System.out.println(c1.getRadius());

        Shape s3 = new Rectangle(3, 4, "Blue", false);
        System.out.println(s3);
        //System.out.println(s3.getArea());
        //System.out.println(s3.getPerimeter());
        //System.out.println(s3.getColor());

        Rectangle r1 = (Rectangle)s3;
        System.out.println(r1);
        //System.out.println(r1.getArea());
        //System.out.println(r1.getColor());
        //System.out.println(r1.getLength());

        Shape s4 = new Square(4);
        System.out.println(s4);
        //System.out.println(s4.getArea());
        //System.out.println(s4.getColor());

        Rectangle r2 = (Rectangle)s4;
        System.out.println(r2);
        //System.out.println(r2.getArea());
        //System.out.println(r2.getColor());
        //System.out.println(r2.getLength());

        Square sq1 = (Square)r2;
        System.out.println(sq1);
        //System.out.println(sq1.getArea());
        //System.out.println(sq1.getColor());
        //System.out.println(sq1.getSide());
        //System.out.println(sq1.getLength());
    }
}
