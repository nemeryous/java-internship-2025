package array;

public class ExerciseArray02 {

    public static int binarySearch(final int[] arr, final int target) {
        int l = 0;
        int r = arr.length - 1;

        while (l <= r) {
            final int m = (l + r) / 2;

            if (arr[m] == target) return m;

            if (arr[m] < target) l = m + 1;
            else r = m - 1;            
        }

        return -1;
    }
}
