package Ex15;

import Ex13.Point2.Student;

import java.util.ArrayList;
import java.util.LinkedList;

public class Test {

    public static void main(String[] args) {
        ArrayList<String> txtList = new ArrayList<>();
        txtList.add("Hlop");
        txtList.add("Top");
        txtList.addAll(1,txtList);
        System.out.println(txtList);
        LinkedList<String> txtList2 = new LinkedList<>();
        txtList2.add("A.");
        txtList2.add("E.");
        txtList2.add("U.");
        txtList2.add(2,"O.");
        txtList2.add(1,"I.");
        System.out.println(txtList2);
        MyArrayList<Student> studentList= new MyArrayList<>();
        studentList.add(new Student(4));
        studentList.add(new Student(2));
        studentList.add(new Student(5));
        System.out.println(studentList.get(2).getGPA());
        studentList.remove(1);
        System.out.println(studentList.size());
    }
}
