package Ex22;

import java.util.Date;

public class WorkInfo {
    public static void main(String[] args) {
        Student worker;
        DateSet ds = new DateSet();
        Date date = ds.dateSet();
        worker = new Student(date,"Lopatka A.K.");
        date = new Date();
        System.out.println("Worked by:"+worker.getName());
        System.out.println("Date of start :"+ worker.toString(3));
        System.out.println("Date of end :"+ date.toString());
    }
}
