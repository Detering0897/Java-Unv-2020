package Ex17;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.util.Scanner;

public class FileTest {
    public static void main(String[] args) throws IOException {

        Path path = Path.of("C:\\Users\\Admin\\Desktop");
        File file = new File("C:\\Users\\Admin\\Desktop\\1.txt");
        Scanner console = new Scanner(System.in);
        String input = console.nextLine();
        FileWriter writer = new FileWriter(file);
        writer.write(input);
        writer.flush();
        FileReader reader = new FileReader (file);
        int c;
        while((c=reader.read())!=-1){

            System.out.print((char)c);
        }
        writer.write(" = Ceyboard Input ");
        writer.flush();
    }
}
