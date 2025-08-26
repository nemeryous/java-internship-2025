
package string;

public class ExerciseString05 {
   
        public static String decompressString(String input) {
            if (input == null || input.isEmpty()) return input;
            StringBuilder result = new StringBuilder();
            int i = 0;
            while (i < input.length()) {
                char c = input.charAt(i);
                int j = i + 1;
                StringBuilder num = new StringBuilder();
                while (j < input.length() && Character.isDigit(input.charAt(j))) {
                    num.append(input.charAt(j));
                    j++;
                }
                int repeat = 1;
                if (num.length() > 0) {
                    repeat = Integer.parseInt(num.toString());
                }
                for (int k = 0; k < repeat; k++) {
                    result.append(c);
                }
                i = j;
            }
            return result.toString();
        }
}
