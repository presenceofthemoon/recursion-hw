package ru.urfu;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FirstTaskTest {

    @Test
    void testBaseCase() {
        assertEquals(3, FirstTask.money(3, 4, 0));
        assertEquals(10, FirstTask.money(10, -2, 0));
    }

    @Test
    void testRecursive() {
        assertEquals(15, FirstTask.money(3, 4, 3));
        assertEquals(4, FirstTask.money(10, -2, 3));
        assertEquals(6, FirstTask.money(1, 1, 5));
        assertEquals(0, FirstTask.money(0, 0, 10));
    }
}