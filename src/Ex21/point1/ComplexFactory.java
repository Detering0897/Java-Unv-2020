package Ex21.point1;



public class ComplexFactory implements Factory{
    public Complex create(){
        return new Complex();
    }
    public Complex create(int re, int im){
        return new Complex(re, im);
    }
}
