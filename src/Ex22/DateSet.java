package Ex22;


import java.util.Date;
import java.util.Scanner;

public class DateSet {
    public Date dateSet (){
        Scanner myScanner = new Scanner( System.in );
        int year = Integer.parseInt(myScanner.next()) - 1900;
        int mounth = Integer.parseInt(myScanner.next());
        int day = Integer.parseInt(myScanner.next());
        int hour = Integer.parseInt(myScanner.next());
        int minute = Integer.parseInt(myScanner.next());
        Date date = new Date(year,mounth,day,hour,minute);
        return date;
    }
}
