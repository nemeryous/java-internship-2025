package stream;

import java.util.Arrays;

public class ExerciseStream01 {

    public static int sumEvenMinusOdd(final int[] arr) {
        return Arrays.stream(arr).map(n -> n % 2 == 0 ? n : -n).sum();
    }
}
