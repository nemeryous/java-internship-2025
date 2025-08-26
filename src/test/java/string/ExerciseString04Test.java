package string;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ExerciseString04Test {

    @Test
    void shouldCompressString_OK() {
        assertEquals("abc4e6fd", ExerciseString04.compressString("abcccceeeeeefd"));
        assertEquals("ab13c", ExerciseString04.compressString("abbbbbbbbbbbbbc"));
        assertEquals("a", ExerciseString04.compressString("a"));
        assertEquals("a2b2c2", ExerciseString04.compressString("aabbcc"));
        assertEquals("abc", ExerciseString04.compressString("abc"));
        assertEquals("", ExerciseString04.compressString(""));
        assertEquals("A2B2C2", ExerciseString04.compressString("AABBCC"));
        assertEquals("aA", ExerciseString04.compressString("aA"));
    }
}
