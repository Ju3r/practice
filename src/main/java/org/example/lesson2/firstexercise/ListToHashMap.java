package org.example.lesson2.firstexercise;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ListToHashMap {
    private static List<String> list = List.of("apple", "banana", "orange", "pear");
    public static void ListToHashMapExample() {
        System.out.println("\n*** LIST TO HASHMAP EXAMPLE ***");
        System.out.println("LIST: " + list);
        Map<String, Integer> map = list.stream()
                .collect(Collectors.toMap(item -> item, item -> item.length()));

        System.out.println("Hashmap: " + map);
        System.out.println("*** END EXAMPLE ***");
    }
}
