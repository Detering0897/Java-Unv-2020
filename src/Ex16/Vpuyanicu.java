package Ex16;

import java.util.ArrayList;
import java.util.Random;

public class Vpuyanicu {

    public static void main(String[] args) {
        Random rand=new Random();
        ArrayList<Integer> first = new ArrayList<>();
        ArrayList<Integer> second = new ArrayList<>();
        for (int i =0; i<10;++i){
            if (rand.nextInt(2)==0){
                if (first.size() < 5)
                    first.add(i);
                else
                    second.add(i);
            }
            else {
                if (second.size() < 5)
                    second.add(i);
                else
                    first.add(i);
            }

        }
        System.out.println(first);
        System.out.println(second);
        int count =0;
        while (true){
            count++;
            if ((first.get(0) >second.get(0)) || (first.get(0)==0 && second.get(0)==9) ){
                int f = first.get(0), s =second.get(0);
                first.remove(0);
                second.remove(0);
                first.add(f);
                first.add(s);
            }
            else {
                int f = first.get(0), s =second.get(0);
                first.remove(0);
                second.remove(0);
                second.add(s);
                second.add(f);
            }
            if (first.size()==0){
                System.out.println("Second");
                System.out.println(count);
                break;
            }
            if (second.size()==0){
                System.out.println("First");
                System.out.println(count);
                break;
            }
            if (count == 106){
                System.out.println("Botva");
                break;
            }
        }
    }
}
