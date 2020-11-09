package Ex20;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

class Opener {
    public void Open(){
        File file=new File("C:\\Users\\Admin\\Desktop\\PRG\\pic");
        if(!file.isDirectory() || !file.exists())return;
        List<File> list=new ArrayList<File>();
        for(File elem : file.listFiles())list.add(elem);
        try{
            for(int i=0;i<5;i++)System.out.println(list.get(i).getName());

        }catch(Exception e){
            System.out.println("Files in the dictionary is less than 5");
        }
    }

}

public class TestClass {
    public static void main(String[] args) {
        Opener o=new Opener();
        o.Open();
    }
}
