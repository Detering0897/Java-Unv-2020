package Ex14;

public class Main {
    public static void main(String[] args) {
        Test[] mass= new Student[10];
        mass[0] = new Student(7, 1);
        mass[1] = new Student(3, 2);
        mass[2] = new Student(6.75, 3);
        mass[3] = new Student(8, 4);
        mass[4] = new Student(12.4, 5);
        mass[5] = new Student(2.34, 6);
        mass[6] = new Student(8.7, 7);
        mass[7] = new Student(3.5, 8);
        mass[8] = new Student(4, 9);
        mass[9] = new Student(9, 10);

        Student.linearSearch(mass, 8.7);
        Student.binarySearch(mass, 1, 8, 8);
    }
}