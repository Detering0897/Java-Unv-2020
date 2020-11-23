package Ex23.Point2;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class City{
    private String city;
    private String country;

    public String getCity() {
        return city;
    }

    public String getCountry() {
        return country;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public static void main(String[] args) {
        Map<String, ArrayList<String>> map = new HashMap();
        ArrayList<String> currentCountry = new ArrayList<String>();
        currentCountry.add("Moskow");
        currentCountry.add("Smolensk");
        currentCountry.add("Kirov");
        map.put("Russia",currentCountry);
        currentCountry = new ArrayList<String>();
        currentCountry.add("Berlin");
        currentCountry.add("Gamburg");
        currentCountry.add("Essen");
        map.put("Germany",currentCountry);
        System.out.println(map);
    }
}
