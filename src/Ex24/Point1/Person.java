package Ex24.Point1;

import java.util.Scanner;

public class Person {
    private String fio;

    public Person(String fio) {
        this.fio = fio;
    }
    public String Return(){
        try{
            String separated[] = fio.split(" ");
            return separated[0]+" "+separated[1].charAt(0)+"."+separated[2].charAt(0)+".";
        }
        catch (Exception ex){
            return "Error";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Person person = new Person(scanner.nextLine());
        System.out.println(person.Return());
    }
}
