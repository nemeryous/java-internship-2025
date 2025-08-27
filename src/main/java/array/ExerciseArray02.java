package array;

public class ExerciseArray02 {

    public static int binarySearch(final int[] arr, final int target) {

        int l = 0;
        int r = arr.length - 1;
        int m = (l + r) / 2;
        final boolean isAsc = arr.length > 1 && arr[0] < arr[1];

        while (l <= r) {
            if (arr[m] == target) return m;

            if (isAsc) {
                if (arr[m] < target) l = m + 1;
                else r = m - 1;
            } else {
                if (arr[m] > target) l = m + 1;
                else r = m - 1;
            }
            
            m = (l + r) / 2;
        }

        return -1;
    }
}
