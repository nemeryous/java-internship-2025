package basic;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import java.util.Arrays;

import org.junit.jupiter.api.Test;

public class Exercise04Test {

    
    @Test
    void testFibonacciList() {
    assertEquals(Exercise04.fibonacciList(5), Arrays.asList(1, 1, 2, 3, 5));
    assertEquals(Exercise04.fibonacciList(10), Arrays.asList(1, 1, 2, 3, 5, 8));
    assertEquals(Exercise04.fibonacciList(1), Arrays.asList(1, 1));
    assertEquals(Exercise04.fibonacciList(0), Arrays.asList());
    assertEquals(Exercise04.fibonacciList(-5), Arrays.asList());
    }

}
