package string;

public class ExerciseString05 {

    public static String decompressString(final String input) {

        if (input == null || input.isEmpty()) {
            return input;
        }

        final StringBuilder result = new StringBuilder();
        int i = 0;

        while (i < input.length()) {
            char c = input.charAt(i);
            int j = i + 1;
            int num = 0;

            while (j < input.length() && Character.isDigit(input.charAt(j))) {
                num = num * 10 + (input.charAt(j) - '0');
                j++;
            }

            if (num == 0) {
                num = 1;
            }

            for (int k = 0; k < num; k++) {
                result.append(c);
            }

            i = j;
        }

        return result.toString();
    }
}
