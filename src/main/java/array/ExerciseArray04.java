package array;

public class ExerciseArray04 {

    public static int[] mergeTwoSortedArray(final int[] arr1, final int[] arr2) {
        final int arr1Length = arr1.length;
        final int arr2Length = arr2.length;
        int i = 0;
        int j = 0;
        final int[] merge = new int[arr1Length + arr2Length];
        int k = 0;

        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                merge[k] = arr1[i];
                i++;
            } else {
                merge[k] = arr2[j];
                j++;
            }

            k++;
        }

        while (i < arr1Length) {
            merge[k] = arr1[i];
            i++;
            k++;
        }

        while (j < arr2Length) {
            merge[k] = arr2[j];
            j++;
            k++;
        }

        return merge;

    }

}
