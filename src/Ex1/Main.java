package Ex1;

import java.util.Random;

import static java.lang.Math.random;

public class Main {

    public static int factorial (int num)
    {
        int a=1;
        for (int i = 0; i < num; ++i)
        {
            a *= (1+i);
        }
        return a;
    }

    public static void main(String[] args) {
        /*
        int[] arr = {29, 45, 64, 3, 34, 8, 43, 87, 15, 69};
        int sum =0;
        for (int i = 0; i < 10; ++i)
        {
            sum +=arr[i];
        }
        System.out.println(sum);
        sum =0;
        int i =0;
        while ( i<10)
        {
            sum +=arr[i];
            ++i;
        }
        sum =0;
        i =0;
        do
        {
            sum +=arr[i];
            ++i;
        }while (i<10);
        System.out.println(sum);

        for (i=0; i < args.length; ++i) {
            System.out.println(args[i]);
        }
        for (i = 0; i < 10; ++i)
        {
            double k= i +1.0;
            double harm = 1.0/ k;
            System.out.print(harm);
            System.out.print(" ");
        }
        System.out.println("");
        double[] randArr = new double [10];
        Random rand = new Random();

        for (i = 0; i < randArr.length; ++i)
        {
            if (i%2==0)
                randArr[i]=random();
            else
                randArr[i] =rand.nextDouble();
        }

        for (i = 0; i < 10; ++i)
        {
            System.out.println(randArr[i]);
        }
        int fact = 1;

        System.out.println(factorial(8));
        */
    }
}
