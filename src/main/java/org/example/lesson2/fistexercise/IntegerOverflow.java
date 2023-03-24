package org.example.lesson2.fistexercise;

import java.math.BigInteger;
import java.math.BigDecimal;

public class IntegerOverflow {
    private static int maxValue = Integer.MAX_VALUE;
    public static void exampleIntOverflow() {
        System.out.println("*** INTEGER OVERFLOW EXAMPLE ***");
        System.out.println("Integer MAX_VALUE: " + maxValue);
        System.out.println("Integer MAX_VALUE + 1: " + (maxValue + 1));

        BigInteger bigIntegerValue = BigInteger.valueOf(maxValue);
        bigIntegerValue = bigIntegerValue.add(BigInteger.ONE);
        System.out.println("\nBigInteger MAX_VALUE + 1: " + bigIntegerValue);

        BigDecimal bigDecimalValue = BigDecimal.valueOf(maxValue);
        bigDecimalValue = bigDecimalValue.add(BigDecimal.ONE);
        System.out.println("BigDecimal MAX_VALUE + 2: " + bigDecimalValue);
        System.out.println("*** END EXAMPLE ***");
    }
}
