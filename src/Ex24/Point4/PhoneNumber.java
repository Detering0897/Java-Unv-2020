package Ex24.Point4;

import java.util.Scanner;

public class PhoneNumber {
    private String standart="";

    public PhoneNumber(String numb) {
        if (!numb.contains("+")) {

            standart += "+7";
            for (int i = 1; i < numb.length(); i++) {
                if (i == 4 || i == 7) {
                    standart += "-";
                }
                standart += numb.substring(i,i);
            }
        }
        else {
            int k=0;
            standart+="+";
            for (int i=1; i<numb.length() - 7; i++){
                standart+=numb.substring(i,i);
            }
            standart+="-";
            for (int i=numb.length() - 7;i<numb.length();i++) {
                if (k == 3) {
                    standart+="-";
                }
                k++;
                standart+=numb.substring(i,i);
            }
        }
    }


    @Override
    public String toString() {
        return "PhoneNumber{" +
                "mainNumb=" + standart +
                '}';
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PhoneNumber phoneNumber = new PhoneNumber(scanner.nextLine());
        System.out.println(phoneNumber.toString());
    }
}
