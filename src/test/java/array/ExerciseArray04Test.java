package array;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

public class ExerciseArray04Test {

    @Test
    void shouldMergeTwoSortedArray_OK() {
        assertArrayEquals(new int[] { 1, 2, 3, 4, 5, 6, 7 }, ExerciseArray04.mergeTwoSortedArray(new int[] { 1, 3, 5 }, new int[] { 2, 4, 6, 7 }));
        assertArrayEquals(new int[] { 1, 2, 3, 4, 5, 6 }, ExerciseArray04.mergeTwoSortedArray(new int[] { 1, 2, 3 }, new int[] { 4, 5, 6 }));
        assertArrayEquals(new int[] { 1, 2, 2, 3, 4, 5 }, ExerciseArray04.mergeTwoSortedArray(new int[] { 1, 2, 3 }, new int[] { 2, 4, 5 }));
        assertArrayEquals(new int[] { 1, 2, 3, 4 }, ExerciseArray04.mergeTwoSortedArray(new int[] { 1, 2 }, new int[] { 3, 4 }));
    }
}
