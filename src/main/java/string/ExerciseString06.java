package string;

import java.util.ArrayList;
import java.util.List;

public class ExerciseString06 {
    public static boolean isValidBarcode(String str) {
        if (str == null || str.length() != 13) return false;
        List<Integer> nums = new ArrayList<>();
        for (char c : str.toCharArray()) {
            if (!Character.isDigit(c)) return false;
            nums.add(Character.getNumericValue(c));
        }

        for (int i = 0; i < nums.size() - 1; i++) {
            if (i % 2 == 0) {
                nums.set(i, nums.get(i) * 1);
            } else {
                nums.set(i, nums.get(i) * 3);
            }
        }
        int sum = nums.stream().mapToInt(Integer::intValue).sum();

        return sum % 10 == 0;
    }
}
