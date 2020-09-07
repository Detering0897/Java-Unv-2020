package Ex2;

class Dog{
    int age;
    String name;
    Dog (String nm, int ag){
        name = nm;
        age = ag;
    }
    void setAge (int ag)
    {
        age = ag;
    }
    void setName (String nm)
    {
        name = nm;
    }
    int ageInHum ()
    {
        return age*7;
    }
    String toString()
    {

    }
}

public class Main {
    public static void main(String[] args)
    {

    }
}
