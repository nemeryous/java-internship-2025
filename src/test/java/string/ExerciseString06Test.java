package string;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ExerciseString06Test {

    @Test
    void shouldIsValidBarcode_OK() {
        assertEquals(true, ExerciseString06.isValidBarcode("8938505974194"));
        assertEquals(false, ExerciseString06.isValidBarcode("1234567890153"));
        assertEquals(false, ExerciseString06.isValidBarcode("1234567890122"));
    }
}
