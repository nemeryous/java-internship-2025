package string;

public class ExerciseString02 {

    public static int sumOfIntegersInString(final String str) {

        int sum = 0;
        final String[] parts = str.split("\\s+");

        for (String part : parts) {
            if (part.matches("\\d+")) {
                sum += Integer.parseInt(part);
            }
        }

        return sum;

    }
}
