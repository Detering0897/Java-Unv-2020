package Ex19;

import java.util.Scanner;

class Product {
    private long INN;
    private String Name;
    public Product (String name , long inn){
        Name = name;
        INN = inn;
    }

    public long getINN() {
        return INN;
    }

    public void setINN(long INN) {
        this.INN = INN;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }
}


public class TestClass {
    static Product[] box = new Product[5];
     static void scan(long inn){
         boolean found = false;
        for (int i =0; i < box.length; ++i){
            if (box[i].getINN() == inn){
                System.out.print("Founded. Name: ");
                System.out.println(box[i].getName());
                found = true;
            }
        }
        if (!found){
            System.out.print("Error! Not founded.");
        }
     }
    static void scan(String name){
        boolean found = false;
        for (int i =0; i < box.length; ++i){
            if (box[i].getName().equals(name)){
                System.out.print("Founded. Name: ");
                System.out.println(box[i].getName());
                found = true;
            }
        }
        if (!found){
            System.out.print("Error! Not founded.");
        }
    }
     static boolean tester (long inn){
         if (inn%1000000000==1 &&
                 inn%100000000==9 &&
                 inn%10000000==7 &&
                 inn%1000000==5)
             return true;
         return false;
     }

    public static void main(String[] args) {
        box[0]=new Product ("adaw", 1975730127);
        box[1]=new Product ("jhgg", 1975164349);
        box[2]=new Product ("pooi", 1975743622);
        box[3]=new Product ("lmnb", 1975960042);
        box[4]=new Product ("sefgs", 1975123713);
        Scanner myScanner = new Scanner( System.in );
        System.out.print( "Enter Name: ");
        /*
        long input = Long.parseLong(myScanner.next());
        if (tester(input)) {
            scan(input);
        }
        else
            System.out.println("INN is uncorrect");*/
        scan(myScanner.next());
    }
}
