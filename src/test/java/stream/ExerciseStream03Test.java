package stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ExerciseStream03Test {

    @Test
    void shouldConvertNumberToString() {
        assertEquals("One, Two, Three", ExerciseStream03.convertNumberToString(123));
        assertEquals("Five, Zero, Seven", ExerciseStream03.convertNumberToString(507));
        assertEquals("Nine", ExerciseStream03.convertNumberToString(9));
        assertEquals("One, Zero", ExerciseStream03.convertNumberToString(10));
    }
}
