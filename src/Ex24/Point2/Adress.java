package Ex24.Point2;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Adress {
    private String country;
    private String region;
    private String town;
    private String street;
    private String house;
    private String housing;
    private String flat;

    public Adress(String adress, String/*Tokenizer*/ sep) {

        String[] str = adress.split(sep/*.toString()*/);
        country = str[0];
        region = str[1];
        town = str[2];
        street = str[3];
        house = str[4];
        housing = str[5];
        flat = str[6];
    }

    @Override
    public String toString() {
        return "Adress{" +
                "country='" + country + '\'' +
                ", region='" + region + '\'' +
                ", town='" + town + '\'' +
                ", street='" + street + '\'' +
                ", house='" + house + '\'' +
                ", housing='" + housing + '\'' +
                ", flat='" + flat + '\'' +
                '}';
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Adress adress = new Adress(scanner.nextLine(),",");
        System.out.println(adress.toString());
    }
}
