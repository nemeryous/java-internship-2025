package string;

public class ExerciseString02 {
    public static int sumOfIntegersInString(String str) {
        int sum = 0;

        String[] parts = str.split("\\s+");
        for (String part : parts) {
            if (part.matches("\\d+")) {
                sum += Integer.parseInt(part);
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        String str = "abc 123 def 33 mn 3.221";
        System.out.println(sumOfIntegersInString(str)); // Output: 380
    }
}
