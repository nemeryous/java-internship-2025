package string;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class ExerciseString01Test {
    @Test
    void testIsPalindrome() {
        assertTrue(ExerciseString01.isPalindrome("racecar"));
        assertTrue(ExerciseString01.isPalindrome("AmanaplanacanalPanama"));
        assertFalse(ExerciseString01.isPalindrome("hello"));
    }
}
