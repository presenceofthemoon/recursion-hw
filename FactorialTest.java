package ru.urfu;

import org.junit.jupiter.api.Test;
import java.math.BigInteger;
import static org.junit.jupiter.api.Assertions.*;

public class FactorialTest {

    @Test
    void testBaseCaseLong() {
        assertEquals(1L, Factorial.factorialLong(0));
        assertEquals(1L, Factorial.factorialLong(1));
    }

    @Test
    void testBaseCaseBigInt() {
        assertEquals(BigInteger.ONE, Factorial.factorialBigInt(0));
        assertEquals(BigInteger.ONE, Factorial.factorialBigInt(1));
    }

    @Test
    void testRecursiveLong() {
        assertEquals(2L, Factorial.factorialLong(2));
        assertEquals(6L, Factorial.factorialLong(3));
        assertEquals(120L, Factorial.factorialLong(5));
        assertEquals(3628800L, Factorial.factorialLong(10));
    }

    @Test
    void testRecursiveBigInt() {
        assertEquals(BigInteger.valueOf(2), Factorial.factorialBigInt(2));
        assertEquals(BigInteger.valueOf(6), Factorial.factorialBigInt(3));
        assertEquals(BigInteger.valueOf(120), Factorial.factorialBigInt(5));
        assertEquals(BigInteger.valueOf(3628800), Factorial.factorialBigInt(10));
    }

    @Test
    void testOverflowPoint() {
        assertEquals(BigInteger.valueOf(Factorial.factorialLong(20)),
                     Factorial.factorialBigInt(20));

        assertNotEquals(BigInteger.valueOf(Factorial.factorialLong(21)),
                        Factorial.factorialBigInt(21));

        BigInteger expected21 = new BigInteger("51090942171709440000");
        assertEquals(expected21, Factorial.factorialBigInt(21));
    }
}