package Ex14;

public class Main {
    public static void main(String[] args) {
        Test[] sts= new Student[5];
        sts[0] = new Student(2.5, 1);
        sts[1] = new Student(3, 2);
        sts[2] = new Student(3.75, 3);
        sts[3] = new Student(4.5, 4);
        sts[4] = new Student(5, 5);

        Student.linearSearch(sts, 4.5);
        Student.binarySearch(sts, 1, 5, 5);
    }
}