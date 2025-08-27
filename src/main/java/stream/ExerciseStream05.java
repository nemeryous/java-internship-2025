package stream;

import java.util.Arrays;

public class ExerciseStream05 {

    public static int sumOfLongestNumbers(final int[] arr) {
        int maxLength = Arrays.stream(arr)
                .mapToObj(String::valueOf)
                .mapToInt(String::length)
                .max()
                .orElse(0);

        return Arrays.stream(arr)
                .filter(n -> String.valueOf(n).length() == maxLength)
                .sum();
    }
}
