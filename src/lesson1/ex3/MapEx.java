package lesson1.ex3;

import java.util.Map;
import java.util.TreeMap;

public class MapEx {
    public static void main(String[] args) {
        Map<String, Integer> map = new TreeMap<>();
        map.put("D", 4);
        map.put("E", 5);
        map.put("F", 6);

        for(String key: map.keySet()){
            System.out.print(" " + key);
        }
        System.out.println();

        for(Integer value : map.values()){
            System.out.print(" " + value);
        }
        System.out.println();

        for(Map.Entry<String, Integer> entry : map.entrySet()){
            System.out.println(entry.getKey() + " "+ entry.getValue() + " " + entry);
        }
    }
}
