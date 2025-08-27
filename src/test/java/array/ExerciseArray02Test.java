package array;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ExerciseArray02Test {

    @Test
    void shouldBinarySearch_OK() {
        assertEquals(2, ExerciseArray02.binarySearch(new int[] { 1, 3, 5, 7, 9 }, 5));
        assertEquals(0, ExerciseArray02.binarySearch(new int[] { 1, 3, 5, 7, 9 }, 1));
        assertEquals(4, ExerciseArray02.binarySearch(new int[] { 1, 3, 5, 7, 9 }, 9));
        assertEquals(-1, ExerciseArray02.binarySearch(new int[] { 1, 3, 5, 7, 9 }, 8));
    }
}
