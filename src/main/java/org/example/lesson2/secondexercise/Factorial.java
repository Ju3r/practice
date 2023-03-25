package org.example.lesson2.secondexercise;

import java.math.BigInteger;

public class Factorial {
    public static void main(String[] args) {
        int n = 21000;
        long resultLong = factorialLong(n);
        BigInteger resultBigInt = factorialBigInt(n);
        System.out.printf("Factorial of %d is %d (Long)\n", n, resultLong);
        System.out.printf("Factorial of %d is %d (BigInteger)", n, resultBigInt);
    }

    public static long factorialLong(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Input must be non-negative");
        }
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorialLong(n - 1);
    }

    public static BigInteger factorialBigInt(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Input must be non-negative");
        }
        if (n == 0 || n == 1) {
            return BigInteger.valueOf(1);
        }
        return BigInteger.valueOf(n).multiply(factorialBigInt(n - 1));
    }
}