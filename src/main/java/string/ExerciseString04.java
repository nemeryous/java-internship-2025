package string;

public class ExerciseString04 {

    public static String compressString(final String input) {

        if (input == null || input.isEmpty()) {
            return input;
        }

        final StringBuilder result = new StringBuilder();
        char currentChar = input.charAt(0);
        int count = 1;

        for (int i = 1; i < input.length(); i++) {
            if (input.charAt(i) == currentChar) {
                count++;
            } else {
                result.append(currentChar);

                if (count > 1) {
                    result.append(count);
                }

                currentChar = input.charAt(i);
                count = 1;
            }
        }

        result.append(currentChar);

        if (count > 1) {
            result.append(count);
        }

        return result.toString();
    }
}
