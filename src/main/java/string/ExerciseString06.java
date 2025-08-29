package string;

public class ExerciseString06 {

    public static boolean isValidBarcode(final String str) {
        if (str == null || str.length() != 13) {
            return false;
        }

        int sum = 0;

        for (int i = 0; i < str.length(); i++) {
            final int digit = str.charAt(i) - '0';
            
            if ((i + 1) % 2 == 0) {
                sum += digit * 3;
            } else {
                sum += digit;
            }
        }

        return sum % 10 == 0;
    }
}
