package Ex13.Point2;

import java.util.Comparator;

public class Student implements Comparable<Student>{
    private int GPA;
    private int i=0;
    private String Name;
    public Student(int GPA){
        this.GPA=GPA;
    }
    public void sled(){
        i++;
    }

    public void setName(String name) {
        this.Name = name;
    }

    public void setGPA(int GPA) {
        this.GPA = (int)(Math.random() * 100);

    }
    public String getName() {
        return Name;
    }

    public int getGPA() {
        return GPA;
    }

    @Override
    public String toString() {

        return "GPA = " + GPA ;
    }

    @Override
    public int compareTo(Student o) {
        return(this.GPA - o.GPA);
    }
}

