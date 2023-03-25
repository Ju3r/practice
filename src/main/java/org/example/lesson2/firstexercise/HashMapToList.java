package org.example.lesson2.firstexercise;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class HashMapToList {
    private static Map<String, Integer> map = new HashMap<>();

    public static void main(String[] args) {
        System.out.println("\n*** HASHMAP TO LIST EXAMPLE ***");
        map.put("apple", 5);
        map.put("banana", 6);
        map.put("orange", 6);
        map.put("pear", 4);
        System.out.println("HASHMAP: " + map);

        List<String> list = map.entrySet().stream()
                .map(entry -> entry.getKey() + "-" + entry.getValue())
                .collect(Collectors.toList());
        System.out.println("LIST: " + list);
        System.out.println("*** END EXAMPLE ***");
    }
}
