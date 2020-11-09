package Ex22;

import java.util.Date;

public class Student {
    private String name;
    private int day;
    private int month;
    private String sMonth;
    private int year;
    private Date fullDate;

    void std(int d,int m, int y, String n){
        day = d;
        month = m;
        switch (m){
            case 1: sMonth = "January";break;
            case 2: sMonth = "Febrary";break;
            case 3: sMonth = "March";break;
            case 4: sMonth = "April";break;
            case 5: sMonth = "May";break;
            case 6: sMonth = "June";break;
            case 7: sMonth = "July";break;
            case 8: sMonth = "August";break;
            case 9: sMonth = "September";break;
            case 10: sMonth = "October";break;
            case 11: sMonth = "November";break;
            case 12: sMonth = "December";break;
        }
        year = y;
        name = n;
    }
    Student (int d,int m, int y, String n){
        std (d, m, y, n);
    }
    Student (Date date, String n){
        std (date.getDate(),date.getMonth(), date.getYear(),n);
        fullDate = date;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public String getName() {
        return name;
    }

    public Date getFullDate() {
        return fullDate;
    }

    public String toString(int type) {
        switch (type) {
            case 0:
                return day + "." + month + "." + (year % 100);//name + ": "+
            case 1:
                return day + " " + month + " " + year;
            case 2:
                return day + " of " + sMonth + " of " + year + " year ";
            case 3:
                return fullDate.toString();
        }
        return "";
    }
    /*
    public static void main(String[] args) {
        Student sss = new Student (5,5,2002);
        System.out.println(sss.toString(0));
        System.out.println(sss.toString(1));
        System.out.println(sss.toString(2));
    }*/
}
