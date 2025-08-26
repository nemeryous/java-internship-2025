package basic;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class Exercise07Test {

    @Test
    void shouldReverseBinary_OK() {
        assertEquals(Exercise07.reverseBinary(5), 5);
        assertEquals(Exercise07.reverseBinary(10), 5);
        assertEquals(Exercise07.reverseBinary(15), 15);
        assertEquals(Exercise07.reverseBinary(23), 29);
        assertEquals(Exercise07.reverseBinary(8), 1);
        assertEquals(Exercise07.reverseBinary(0), 0);
    }
}
