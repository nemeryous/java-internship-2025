package array;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ExerciseArray05Test {

    @Test
    void shouldFindMissingNumber_OK() {
        assertEquals(3, ExerciseArray05.findMissingNumber(new int[] { 1, 2, 4, 5 }));
        assertEquals(1, ExerciseArray05.findMissingNumber(new int[] { 2, 3, 4, 5 }));
        assertEquals(5, ExerciseArray05.findMissingNumber(new int[] { 1, 2, 3, 4 }));
        assertEquals(1, ExerciseArray05.findMissingNumber(new int[] {}));
    }
}
