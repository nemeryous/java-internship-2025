package array;

public class ExerciseArray04 {
    
    public static int[] mergeTwoSortedArray(final int[] arr1, final int[] arr2) {

        final int[] merge = new int[arr1.length + arr2.length];
        int i = 0;
        int j = 0;
        int k = 0;
        final boolean isAsc = (arr1.length > 1 && arr1[0] < arr1[1]) || (arr2.length > 1 && arr2[0] < arr2[1]);

        while (i < arr1.length && j < arr2.length) {
            if (isAsc) {
                if (arr1[i] < arr2[j]) merge[k++] = arr1[i++];
                else merge[k++] = arr2[j++];
            } else {
                if (arr1[i] > arr2[j]) merge[k++] = arr1[i++];
                else merge[k++] = arr2[j++];
            }
        }

        while (i < arr1.length) {
            merge[k++] = arr1[i++];
        }

        while (j < arr2.length) {
            merge[k++] = arr2[j++];
        }

        return merge;

    }
}
