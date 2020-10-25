package Ex13.Point2;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class TestSort {
    public static void insertionSort(Comparable[] array)
    {
        for (int left = 0; left < array.length; left++) {

            Comparable temp= array[left];

            int i = left - 1;
            for (; i >= 0; i--) {

                if (0 < array[i].compareTo(temp)) {
                    array[i + 1] = array[i];
                } else {

                    break;
                }
            }

            array[i + 1] = temp;
        }
    }
    public static void selectionSort (Comparable[] list) {
        int min;
        Comparable temp;
        for (int index = 0; index < list.length-1; index++)
        {
            min = index;
            for (int scan = index+1; scan < list.length; scan++)
                if (list[scan].compareTo(list[min]) < 0)
                    min = scan;
            temp = list[min];
            list[min] = list[index];
            list[index] = temp;
        }
    }

    public static void main(String[] args){
        Student[] arr=new Student[20];
        int GPA;
        for(int i=0;i< arr.length;i++){
            GPA=(int)((Math.random()*300)/3+1);

            arr[i]=new Student(GPA);

        }
        insertionSort(arr);
        for(int i=0;i< arr.length;i++){
            System.out.println( arr[i]+" "+" Name = " + "Student" +(int)(Math.random()*100+1)  );
        }


    }
}

