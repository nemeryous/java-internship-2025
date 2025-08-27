package array;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

public class ExerciseArray03Test {

    @Test
    void shouldReverseArray_OK() {
        final int[] arr1 = { 1, 2, 3, 4, 5 };
        ExerciseArray03.reverseArray(arr1);
        assertArrayEquals(new int[] { 5, 4, 3, 2, 1 }, arr1);

        final int[] arr2 = { 1, 2 };
        ExerciseArray03.reverseArray(arr2);
        assertArrayEquals(new int[] { 2, 1 }, arr2);

        final int[] arr3 = { 7 };
        ExerciseArray03.reverseArray(arr3);
        assertArrayEquals(new int[] { 7 }, arr3);

        final int[] arr4 = {};
        ExerciseArray03.reverseArray(arr4);
        assertArrayEquals(new int[] {}, arr4);
    }
}
