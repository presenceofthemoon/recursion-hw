package ru.urfu;

public class FirstTask {

    public static int money(int first, int difference, int n) {
        if (n < 0) throw new IllegalArgumentException("n must be >= 0");
        if (n == 0) return first;
        return money(first, difference, n - 1) + difference;
    }
}