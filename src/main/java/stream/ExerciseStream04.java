package stream;

import java.util.Arrays;

public class ExerciseStream04 {

    public static int[] sortByDictionaryOrder(final int[] arr) {
        return Arrays.stream(arr)
                .boxed()
                .sorted((a, c) -> String.valueOf(a).compareTo(String.valueOf(c)))
                .mapToInt(Integer::intValue)
                .toArray();
    }
}
