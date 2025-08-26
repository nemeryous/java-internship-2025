package string;

public class ExerciseString03 {

    public static boolean isRepeatedSubString(final String str) {
        int len = str.length();

        for (int i = 1; i <= len / 2; i++) {
            if (len % i == 0) {
                String sub = str.substring(0, i);
                StringBuilder repeated = new StringBuilder();

                for (int j = 0; j < len / i; j++) {
                    repeated.append(sub);
                }

                if (repeated.toString().equals(str)) {
                    return true;
                }
            }
        }

        return false;
    }
}
