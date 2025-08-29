package stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ExerciseStream05Test {

    @Test
    void shouldSumOfLongestNumbers_OK() {
        assertEquals(123 + 456, ExerciseStream05.sumOfLongestNumbers(new int[] { 1, 12, 123, 456 }));
        assertEquals(7890, ExerciseStream05.sumOfLongestNumbers(new int[] { 5, 7890, 23, 67 }));
        assertEquals(0, ExerciseStream05.sumOfLongestNumbers(new int[] {}));
        assertEquals(-1234, ExerciseStream05.sumOfLongestNumbers(new int[] { -1, -12, -1234 }));
        assertEquals(99 + 88, ExerciseStream05.sumOfLongestNumbers(new int[] { 99, 88, 7 }));
    }
}
