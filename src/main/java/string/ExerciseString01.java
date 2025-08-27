package string;

public class ExerciseString01 {

    public static boolean isPalindrome(final String s) {

        int i = 0;
        int j = s.length() - 1;

        while (i < j) {
            if (Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(j))) {
                return false;
            }

            i++;
            j--;
        }

        return true;
    }
}
