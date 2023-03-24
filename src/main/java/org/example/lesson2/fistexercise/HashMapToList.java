package org.example.lesson2.fistexercise;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HashMapToList {
    private static Map<String, Integer> map = new HashMap<>();
    public static void hashMapToListExample() {
        System.out.println("\n*** HASHMAP TO LIST EXAMPLE ***");
        map.put("apple", 5);
        map.put("banana", 6);
        map.put("orange", 6);
        map.put("pear", 4);
        System.out.println("HASHMAP: " + map);

        List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());
        System.out.println("LIST: " + list);
        System.out.println("*** END EXAMPLE ***");
    }
}
