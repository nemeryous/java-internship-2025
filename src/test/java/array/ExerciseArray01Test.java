package array;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ExerciseArray01Test {

    @Test
    void shouldSumEvenMinusOdd_OK() {
        assertEquals(2, ExerciseArray01.sumEvenMinusOdd(new int[] { 2, 4, 1, 3 }));
        assertEquals(2, ExerciseArray01.sumEvenMinusOdd(new int[] { 1, 2, 3, 4 }));
        assertEquals(-9, ExerciseArray01.sumEvenMinusOdd(new int[] { 1, 3, 5 }));
        assertEquals(12, ExerciseArray01.sumEvenMinusOdd(new int[] { 2, 4, 6 }));
    }
}
