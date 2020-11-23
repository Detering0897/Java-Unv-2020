package Ex24.Point3;

class Shirt {
    private String number;
    private String name;
    private String color;
    private String size;

    Shirt(String input){
        try{
            String str[] = input.split(",");
            number = str[0];
            name = str[1];
            color = str[2];
            size = str[3];
        }
        catch (Exception ex){
            System.out.println("Error");
        }
    }

    @Override
    public String toString() {
        return "Shirt{" +
                "number='" + number + '\'' +
                ", name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", size='" + size + '\'' + '}';
    }
}
public class Transformator {

    public static void main(String[] args) {
        String[] shirts = new String[11];
        shirts[0] = "S001,Black Polo Shirt,Black,XL";
        shirts[1] = "S002,Black Polo Shirt,Black,L";
        shirts[2] = "S003,Blue Polo Shirt,Blue,XL";
        shirts[3] = "S004,Blue Polo Shirt,Blue,M";
        shirts[4] = "S005,Tan Polo Shirt,Tan,XL";
        shirts[5] = "S006,Black T-Shirt,Black,XL";
        shirts[6] = "S007,White T-Shirt,White,XL";
        shirts[7] = "S008,White T-Shirt,White,L";
        shirts[8] = "S009,Green T-Shirt,Green,S";
        shirts[9] = "S010,Orange T-Shirt,Orange,S";
        shirts[10] = "S011,Maroon Polo Shirt,Maroon,S";
        for (String shirt : shirts) {
            Shirt new_shirt = new Shirt(shirt);
            System.out.println(new_shirt.toString());
        }
    }
}
