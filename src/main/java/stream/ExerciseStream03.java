package stream;

import java.util.stream.Collectors;

public class ExerciseStream03 {

    private static final String[] strs = new String[] { "Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven",
            "Eight",
            "Nine", "Ten" };

    public static String convertNumberToString(final int number) {
        final String strNumber = String.valueOf(number);

        return strNumber.chars()
                .map(c -> c - '0')
                .mapToObj(i -> strs[i])
                .collect(Collectors.joining(", "));
    }
}
