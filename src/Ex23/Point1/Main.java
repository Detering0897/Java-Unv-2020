package Ex23.Point1;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static HashMap<String, String> createMap()
    {

        HashMap<String, String> map = new HashMap<String, String>();
        map.put("Uda","And");
        map.put("Asta","And");
        map.put("Codo","And");
        map.put("Denu","And");
        map.put("Iga","Oi");
        map.put("Zero","Oi");
        map.put("Fate","Oi");
        map.put("Germ","Zun");
        map.put("Hato","Karo");
        map.put("Jupe","Pegu");

        return map;
    }

    public static void removeTheFirstNameDuplicates(HashMap<String, String> map)
    {

        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> s : copy.entrySet())
        {
            for (Map.Entry<String, String> s2 : copy.entrySet())
            {
                if(s.getValue().equals(s2.getValue())
                        && !s.getKey().equals(s2.getKey()))
                    removeByValue(map,s.getValue());
            }
        }
    }

    public static void removeByValue(HashMap<String, String> map, String value)
    {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair: copy.entrySet())
        {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }

    public static void main(String[] args) {
        HashMap<String, String> map = createMap();
        System.out.println(map);
        removeTheFirstNameDuplicates(map);
        System.out.println(map);
    }
}
