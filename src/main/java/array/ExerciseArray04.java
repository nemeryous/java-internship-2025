package array;

import java.util.Arrays;

public class ExerciseArray04 {

    public static int[] mergeTwoSortedArray(final int[] arr1, final int[] arr2) {

        int i = arr1.length - 1;
        int j = arr2.length - 1;
        final int[] merge = new int[i + j + 2];
        int k = merge.length - 1;

        while (j >= 0) {
            if (i >= 0 && arr1[i] > arr2[j]) {
                merge[k] = arr1[i];
                i--;
            } else {
                merge[k] = arr2[j];
                j--;
            }

            k--;
        }

        while (i >= 0) {
            merge[k--] = arr1[i--];
        }

        return merge;

    }

}
