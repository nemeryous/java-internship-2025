package string;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ExerciseString06Test {

    @Test
    void shouldIsValidBarcode_OK() {
        assertEquals(true, ExerciseString06.isValidBarcode("8938505974194"));
        assertEquals(false, ExerciseString06.isValidBarcode("12345678901A3"));
        assertEquals(false, ExerciseString06.isValidBarcode("123456789012"));
        assertEquals(false, ExerciseString06.isValidBarcode(null));
    }
}
