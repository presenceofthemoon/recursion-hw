package ru.urfu;

public class SecondTask {

    public static int digitSum(int n) {
        if (n < 0) throw new IllegalArgumentException("n must be non-negative");
        if (n < 10) return n;
        return n % 10 + digitSum(n / 10);
    }
}