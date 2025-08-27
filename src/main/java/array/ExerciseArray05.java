package array;

public class ExerciseArray05 {

    public static int findMissingNumber(final int[] arr) {
        final int realArraylength = arr.length + 1;
        final int expectedSum = realArraylength * (realArraylength + 1) / 2;
        int actualSum = 0;

        for (int num : arr) {
            actualSum += num;
        }

        return expectedSum - actualSum;
    }
}
