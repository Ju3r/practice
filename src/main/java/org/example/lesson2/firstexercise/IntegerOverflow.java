package org.example.lesson2.firstexercise;

import java.math.BigInteger;
import java.math.BigDecimal;

public class IntegerOverflow {
    private static int maxValue = Integer.MAX_VALUE;

    public static void main(String[] args) {
        System.out.println("*** INTEGER OVERFLOW EXAMPLE ***");
        System.out.println("Integer MAX_VALUE: " + maxValue);
        System.out.println("Integer MAX_VALUE + 1: " + (maxValue + 1));

        BigInteger bigIntegerValue = BigInteger.valueOf(maxValue);
        bigIntegerValue = bigIntegerValue.add(BigInteger.ONE);
        System.out.println("\nBigInteger MAX_VALUE + 1: " + bigIntegerValue);

        BigDecimal bigDecimalValue = BigDecimal.valueOf(maxValue);
        bigDecimalValue = bigDecimalValue.add(BigDecimal.ONE);
        System.out.println("BigDecimal MAX_VALUE + 1: " + bigDecimalValue);
        System.out.println("*** END EXAMPLE ***");
    }
}
