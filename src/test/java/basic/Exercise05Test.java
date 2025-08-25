package basic;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class Exercise05Test {
    @Test
    void testFactorial() {
        assertEquals(Exercise05.factorial(5), 120);
        assertEquals(Exercise05.factorial(0), 1);
        assertEquals(Exercise05.factorial(-5), 1);
    }
}
