package Ex25;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
//(8+6)*3
public class Brecets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String output = input;
        Pattern pattern = Pattern.compile("\\([\\d+/*-]*\\)");
        Matcher matchers = pattern.matcher(input);
        do {
            input = matchers.replaceAll("");
            matchers = pattern.matcher(input);
        }
        while (matchers.find());
        if (input.matches("[\\d+/*-]*"))
            System.out.println(output);
    }
}
