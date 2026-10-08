package tests;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

class ExampleTest {

    @Test
    void additionWorks() {
        assertEquals(5, 2 + 3);
    }

    @Test
    void stringOperations() {
        String s = "hello";
        assertEquals("HELLO", s.toUpperCase());
        assertEquals(5, s.length());
        assertTrue(s.startsWith("he"));
    }

    @Test
    void listOperations() {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);

        assertEquals(2, list.size());
        assertEquals(10, list.get(0));
        assertFalse(list.isEmpty());
    }

    @Test
    void arraysAreEqual() {
        int[] expected = {1, 2, 3};
        int[] actual = {1, 2, 3};
        assertArrayEquals(expected, actual);
    }

    @Test
    void nullCheck() {
        String s = null;
        assertNull(s);
        assertNotNull("text");
    }

    @Test
    void exceptionIsThrown() {
        assertThrows(ArithmeticException.class, () -> {
            int x = 10 / 0;
        });
    }
}