package org.example.lesson2.fistexercise;

import java.util.Arrays;
import java.util.List;

public class ListInsideList {
    private static List<List<Integer>> nestedList = Arrays.asList(
            Arrays.asList(1, 2, 3),
            Arrays.asList(4, 5, 6),
            Arrays.asList(7, 8, 9)
    );
    public static void listInsideListExample() {
        System.out.println("\n*** LIST INSIDE LIST EXAMPLE ***");
        System.out.println("LIST: " + nestedList);

        List<Integer> bottomList = nestedList.stream()
                .reduce((first, second) -> second)
                .orElseThrow(() -> new RuntimeException("Nested list is empty"));

        System.out.println("NESTED LIST: ");
        bottomList.forEach(System.out::println);
        System.out.println("*** END EXAMPLE ***");
    }
}
