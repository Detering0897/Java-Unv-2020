package Ex13.Point1;

import Ex12.TestFrame;

import javax.swing.*;
import java.util.Arrays;
import java.util.Comparator;

class Student {
    private int ID;
    Student (int id){
        ID=id;
    }
    public int getID() {
        return ID;
    }
}
public class TestClass {
    private Student[] iDNumber = new Student [8];
    TestClass () {
        iDNumber[0] = new Student(8);
        iDNumber[1] = new Student(2);
        iDNumber[2] = new Student(11);
        iDNumber[3] = new Student(7);
        iDNumber[4] = new Student(3);
        iDNumber[5] = new Student(5);
        iDNumber[6] = new Student(1);
        iDNumber[7] = new Student(9);
        int minValueIndex = 0;
        for (int j = 0; j < iDNumber.length; j++) {
            int min = Integer.MAX_VALUE;

            for (int i = j; i < iDNumber.length; i++) {
                if (iDNumber[i].getID() < min) {
                    min = iDNumber[i].getID();
                    minValueIndex = i;
                }
            }

            Student temp = iDNumber[j];
            iDNumber[j] = iDNumber[minValueIndex];
            iDNumber[minValueIndex] = temp;
        }
        for (int i =0; i< 8 ; ++i){
            System.out.print(iDNumber[i].getID());
            System.out.print(" ");
        }
    }
    public static void main(String[] args) {
        TestClass test = new TestClass();
    }
}
