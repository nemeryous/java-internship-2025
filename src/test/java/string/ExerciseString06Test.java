package string;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class ExerciseString06Test {

    @Test
    void shouldIsValidBarcode_OK() {
        assertTrue(ExerciseString06.isValidBarcode("8938505974194"));
        assertFalse(ExerciseString06.isValidBarcode("1234567890153"));
        assertFalse(ExerciseString06.isValidBarcode("1234567890122"));
    }
}
