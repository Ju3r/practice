package org.example.lesson2.firstexercise;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ListInsideList {
    private static List<List<Integer>> nestedList = Arrays.asList(
            Arrays.asList(1, 2, 3),
            Arrays.asList(4, 5, 6),
            Arrays.asList(7, 8, 9)
    );

    public static void main(String[] args) {
        System.out.println("\n*** LIST INSIDE LIST EXAMPLE ***");
        System.out.println("LIST: " + nestedList);

        List<Integer> flattenedList = nestedList.stream()
                .flatMap(List::stream)
                .collect(Collectors.toList());

        System.out.println("FLATTENED LIST: ");
        flattenedList.forEach(System.out::println);
        System.out.println("*** END EXAMPLE ***");
    }
}
