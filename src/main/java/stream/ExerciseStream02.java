package stream;

import java.util.Arrays;

public class ExerciseStream02 {

    public static int findMissingNumber(final int[] arr) {
        final int realArraylength = arr.length + 1;
        final int expectedSum = realArraylength * (realArraylength + 1) / 2;

        final int actualSum = Arrays.stream(arr).sum();

        return expectedSum - actualSum;
    }
}
