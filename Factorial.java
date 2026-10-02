package ru.urfu;

import java.math.BigInteger;

public class Factorial {

    public static long factorialLong(int n) {
        if (n < 0) throw new IllegalArgumentException("n must be non-negative");
        if (n == 0 || n == 1) return 1L;
        return n * factorialLong(n - 1);
    }

    public static BigInteger factorialBigInt(int n) {
        if (n < 0) throw new IllegalArgumentException("n must be non-negative");
        if (n == 0 || n == 1) return BigInteger.ONE;
        return BigInteger.valueOf(n).multiply(factorialBigInt(n - 1));
    }
}