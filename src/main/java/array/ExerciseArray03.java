package array;

public class ExerciseArray03 {

    public static void reverseArray(final int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            final int temp = arr[left];

            arr[left] = arr[right];
            arr[right] = temp;
            
            left++;
            right--;
        }

    }

}
