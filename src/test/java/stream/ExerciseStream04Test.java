package stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

public class ExerciseStream04Test {

    @Test
    void shouldSortByDictionaryOrder_OK() {
        int[] input1 = { 3, 30, 34, 5, 9 };
        int[] expected1 = { 3, 30, 34, 5, 9 };
        assertArrayEquals(expected1, ExerciseStream04.sortByDictionaryOrder(input1));

        int[] input2 = { 21, 2, 11 };
        int[] expected2 = { 11, 2, 21 };
        assertArrayEquals(expected2, ExerciseStream04.sortByDictionaryOrder(input2));

        int[] input3 = { 7 };
        int[] expected3 = { 7 };
        assertArrayEquals(expected3, ExerciseStream04.sortByDictionaryOrder(input3));

        int[] input4 = {};
        int[] expected4 = {};
        assertArrayEquals(expected4, ExerciseStream04.sortByDictionaryOrder(input4));
    }
}
