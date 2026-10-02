package ru.urfu;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SecondTaskTest {

    @Test
    void testBaseCase() {
        assertEquals(0, SecondTask.digitSum(0));
        assertEquals(7, SecondTask.digitSum(7));
        assertEquals(9, SecondTask.digitSum(9));
    }

    @Test
    void testRecursive() {
        assertEquals(14, SecondTask.digitSum(572));
        assertEquals(6, SecondTask.digitSum(1005));
        assertEquals(45, SecondTask.digitSum(99999));
        assertEquals(1, SecondTask.digitSum(10000));
    }
}