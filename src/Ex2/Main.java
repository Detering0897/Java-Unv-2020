package Ex2;

class Dog{
    int age;
    String name;
    Dog (String nm, int ag){
        name = nm;
        age = ag;
        //System.out.println(nm);
        //System.out.println(ag);
    }
    public void setAge (int ag)
    {
        age = ag;
    }
    public void setName (String nm)
    {
        name = nm;
    }
    public int ageInHum ()
    {
        return age*7;
    }
    public String ToString()
    {
        String mess="Age of " + name + " is " + Integer.toString(age);
        return mess;
    }
}

class Pitom{
    Dog pets[] = new Dog[0];
    public void addNew(int num)
    {
        Dog pets2[] = new Dog[pets.length + num];
        for (int i = 0; i < pets.length;++i)
        {
            pets2[i]= pets[i];
        }
        for (int i = 0; i < num;++i)
        {
            Dog doggy = new Dog("Non",2);
            pets2[pets.length + i]= doggy;
        }

        pets = new Dog[pets2.length];
        for (int i = 0; i < pets2.length;++i)
        {
            System.out.println(pets2[i].ToString());
            pets[i]= pets2[i];
        }
    }
}

public class Main {
    public static void main(String[] args)
    {
        Dog bobby = new Dog("Bob",7);
        bobby.setAge(11);
        bobby.setName("Old Bob");
        //System.out.println(bobby.ToString());
        //System.out.println(bobby.ageInHum());
        Pitom central = new Pitom();
        central.addNew(2);
    }
}
