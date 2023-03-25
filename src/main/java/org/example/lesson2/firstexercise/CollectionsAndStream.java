package org.example.lesson2.firstexercise;

import java.util.List;
import java.util.stream.Collectors;

public class CollectionsAndStream {
    private static List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

    public static void main(String[] args) {
        System.out.println("\n*** COLLECTION AND STREAM EXAMPLE ***");
        System.out.println("BEFORE: " + numbers);

        List<Integer> squares = numbers.stream()
                .filter(n -> n % 2 == 0)
                .map(n -> n * n)
                .collect(Collectors.toList());

        System.out.println("AFTER: " + squares);
        System.out.println("*** END EXAMPLE ***");
    }
}

