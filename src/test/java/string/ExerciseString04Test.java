package string;

import org.junit.jupiter.api.Test;

public class ExerciseString04Test {
    @Test
    void testCompressString() {
        // Test các trường hợp mẫu
        org.junit.jupiter.api.Assertions.assertEquals("abc4e6fd", string.ExerciseString04.compressString("abcccceeeeeefd"));
        org.junit.jupiter.api.Assertions.assertEquals("ab13c", string.ExerciseString04.compressString("abbbbbbbbbbbbbc"));
        org.junit.jupiter.api.Assertions.assertEquals("a", string.ExerciseString04.compressString("a"));
        org.junit.jupiter.api.Assertions.assertEquals("a2b2c2", string.ExerciseString04.compressString("aabbcc"));
        org.junit.jupiter.api.Assertions.assertEquals("abc", string.ExerciseString04.compressString("abc"));
        org.junit.jupiter.api.Assertions.assertEquals("", string.ExerciseString04.compressString(""));
        org.junit.jupiter.api.Assertions.assertEquals("A2B2C2", string.ExerciseString04.compressString("AABBCC"));
        org.junit.jupiter.api.Assertions.assertEquals("aA", string.ExerciseString04.compressString("aA"));
    }
}
