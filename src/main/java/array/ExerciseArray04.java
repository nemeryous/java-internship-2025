package array;

import java.util.Arrays;

public class ExerciseArray04 {

    public static int[] mergeTwoSortedArray(final int[] arr1, final int[] arr2) {

        int i = arr1.length - 1;
        int j = arr2.length - 1;
        final int[] merge = new int[i + j + 2];
        int k = merge.length - 1;
        
        while (j >= 0) {
            if (i >= 0 && arr1[i] > arr2[j]) merge[k--] = arr1[i--];
            else merge[k--] = arr2[j--];
        }

        while (i >= 0) {
            merge[k--] = arr1[i--];
        }

        return merge;

    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(mergeTwoSortedArray(new int[] { 1, 3, 5 }, new int[] { 2, 4, 6, 7 })));
        System.out.println(Arrays.toString(mergeTwoSortedArray(new int[] { 1, 2, 3 }, new int[] { 4, 5, 6 })));
        System.out.println(Arrays.toString(mergeTwoSortedArray(new int[] { 1, 2, 3 }, new int[] { 2, 4, 5 })));
        System.out.println(Arrays.toString(mergeTwoSortedArray(new int[] { 1, 2 }, new int[] { 3, 4 })));
    }
}
