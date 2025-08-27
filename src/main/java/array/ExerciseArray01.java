package array;

public class ExerciseArray01 {

    public static int sumEvenMinusOdd(final int[] arr) {
        int sum = 0;

        for (final int num : arr) {
            if (num % 2 == 0) {
                sum += num;
            } else {
                sum -= num;
            }
        }

        return sum;
    }
}
