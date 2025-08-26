package basic;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class Exercise01Test {
    @Test
    void testGcd() {
        assertEquals(6, Exercise01.findGCD(12, 18));
        assertEquals(1, Exercise01.findGCD(7, 5));
        assertEquals(0, Exercise01.findGCD(0, 0));
    }

    @Test
    void testLcm() {
        assertEquals(36, Exercise01.findLCM(12, 18));
        assertEquals(35, Exercise01.findLCM(7, 5));
        assertEquals(0, Exercise01.findLCM(0, 0));
    }

}
