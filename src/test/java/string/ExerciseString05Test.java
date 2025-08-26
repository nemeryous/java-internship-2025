package string;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ExerciseString05Test {
    @Test
    void testDecompressString() {
        // Test các trường hợp mẫu
    assertEquals("abcccceeeeeefd", ExerciseString05.decompressString("abc4e6fd"));
    assertEquals("abbbbbbbbbbbbbc", ExerciseString05.decompressString("ab13c"));
    assertEquals("a", ExerciseString05.decompressString("a"));
    assertEquals("aabbcc", ExerciseString05.decompressString("a2b2c2"));
    assertEquals("abc", ExerciseString05.decompressString("abc"));
    assertEquals("", ExerciseString05.decompressString(""));
    assertEquals("AABBCC", ExerciseString05.decompressString("A2B2C2"));
    assertEquals("aA", ExerciseString05.decompressString("aA"));
    }
}
