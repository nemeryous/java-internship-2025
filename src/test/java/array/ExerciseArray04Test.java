package array;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

public class ExerciseArray04Test {

    @Test
    void shouldMergeTwoSortedArray_OK() {
        assertArrayEquals(new int[] { 1, 2, 3, 4, 5, 6, 7 }, ExerciseArray04.mergeTwoSortedArray(new int[] { 1, 3, 5 }, new int[] { 2, 4, 6, 7 }));
        assertArrayEquals(new int[] { 1, 2, 3 }, ExerciseArray04.mergeTwoSortedArray(new int[] { 1, 2, 3 }, new int[] {}));
        assertArrayEquals(new int[] {}, ExerciseArray04.mergeTwoSortedArray(new int[] {}, new int[] {}));
        assertArrayEquals(new int[] { 7, 6, 5, 4, 3, 2, 1 }, ExerciseArray04.mergeTwoSortedArray(new int[] { 5, 3, 1 }, new int[] { 7, 6, 4, 2 }));
    }
}
