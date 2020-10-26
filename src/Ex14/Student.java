package Ex14;

import java.util.Objects;

public class Student implements Test{
    private double number;
    private int idNum;

    public Student(double number, int idNum) {
        this.number = number;
        this.idNum = idNum;
    }

    public double getNumber() {
        return number;
    }

    public void setNumber(double number) {
        this.number = number;
    }

    public int getIdNum() {
        return idNum;
    }

    public void setIdNum(int idNum) {
        this.idNum = idNum;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Student st = (Student) obj;
        return idNum == st.idNum && Double.compare(st.number, number) == 0;
    }


    public static void linearSearch(Test[] sts, double number) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 5; i++) {
            if (number == sts[i].getNumber()) {
                System.out.println(number+" position -  "+(i+1));
                long finish = System.currentTimeMillis();
                long elapsed = finish - start;
                System.out.println("Time: "+elapsed);
                break;
            }
        }
    }

    public static void binarySearch(Test[] sts, int first, int last, int key) {
        long start = System.currentTimeMillis();
        int pos;

        pos = (first + last) / 2;

        while ((sts[pos].getNumber() != key) && (first <= last)) {
            if (sts[pos].getNumber() > key)
                last = pos - 1;
            else
                first = pos + 1;
            pos = (first + last) / 2;
        }
        if (first <= last) {
            System.out.println(key + " postion - " + (pos+1) );
            long finish = System.currentTimeMillis();
            long elapsed = finish - start;
            System.out.println("Time: "+elapsed);
        }
        else
            System.out.println("Error");
    }
}
