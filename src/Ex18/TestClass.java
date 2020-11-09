package Ex18;


import java.util.Scanner;


public class TestClass {
    public static void exceptionDemo(int i) {
        System.out.println( 2 / 0);
    }

    public static void main(String[] args) {
        Scanner myScanner = new Scanner( System.in );
        System.out.print( "Enter an integer ");
        String intString = myScanner.next();
        int i = Integer.parseInt(intString);
        try {
            exceptionDemo(i); }
        catch(ArithmeticException e){
            e.printStackTrace(); }
    }
}
