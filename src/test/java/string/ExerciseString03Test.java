package string;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class ExerciseString03Test {
    @Test
    void testIsRepeatedSubString() {
        // Chuỗi lặp lại
        assertTrue(ExerciseString03.isRepeatedSubString("abcabcabc"));
        assertTrue(ExerciseString03.isRepeatedSubString("abab"));
        assertTrue(ExerciseString03.isRepeatedSubString("aaaa"));
        assertTrue(ExerciseString03.isRepeatedSubString("xyxyxyxy"));

        // Chuỗi không lặp lại
        assertFalse(ExerciseString03.isRepeatedSubString("abcd"));
        assertFalse(ExerciseString03.isRepeatedSubString("abcab"));
        assertFalse(ExerciseString03.isRepeatedSubString("a"));
        assertFalse(ExerciseString03.isRepeatedSubString("") );

    }
}
