package basic;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class Exercise08Test {

    @Test
    void shouldToRoman_OK() {

        assertEquals(Exercise08.toRoman(1), "I");
        assertEquals(Exercise08.toRoman(4), "IV");
        assertEquals(Exercise08.toRoman(9), "IX");
        assertEquals(Exercise08.toRoman(10), "X");
        assertEquals(Exercise08.toRoman(40), "XL");
        assertEquals(Exercise08.toRoman(50), "L");
        assertEquals(Exercise08.toRoman(90), "XC");
        assertEquals(Exercise08.toRoman(100), "C");
        assertEquals(Exercise08.toRoman(400), "CD");
        assertEquals(Exercise08.toRoman(500), "D");
        assertEquals(Exercise08.toRoman(900), "CM");
        assertEquals(Exercise08.toRoman(1000), "M");
    }
}
