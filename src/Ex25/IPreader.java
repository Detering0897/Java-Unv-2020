package Ex25;

import java.util.Scanner;
import java.util.regex.Pattern;

public class IPreader {

    public static void main(String[] args) {
        String regex = "^(?:([01]?[0-9]?[0-9]|25[0-5]|2[0-4][0-9])\\.){3}([01]?[0-9]?[0-9]|25[0-5]|2[0-4][0-9])$";
        Scanner scanner = new Scanner(System.in);
        String IP = scanner.nextLine();
        if ( Pattern.matches(regex, IP))
            System.out.println("IP adress correct");
        else
            System.out.println("IP adress uncorrect");
    }
}
