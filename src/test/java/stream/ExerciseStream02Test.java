package stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import array.ExerciseArray05;

public class ExerciseStream02Test {
    @Test
    void shouldFindMissingNumber_OK() {
        assertEquals(3, ExerciseArray05.findMissingNumber(new int[] { 1, 2, 4, 5 }));
        assertEquals(1, ExerciseArray05.findMissingNumber(new int[] { 2, 3, 4, 5 }));
        assertEquals(5, ExerciseArray05.findMissingNumber(new int[] { 1, 2, 3, 4 }));
        assertEquals(1, ExerciseArray05.findMissingNumber(new int[] {}));
    }
}
