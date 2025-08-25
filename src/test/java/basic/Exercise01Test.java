package basic;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class Exercise01Test {
    @Test
    void testGcd() {
        assertEquals(6, Exercise01.gcd(12, 18));
        assertEquals(1, Exercise01.gcd(7, 5));
        assertEquals(0, Exercise01.gcd(0, 0));
    }

    @Test
    void testLcm() {
        assertEquals(36, Exercise01.lcm(12, 18));
        assertEquals(35, Exercise01.lcm(7, 5));
        assertEquals(0, Exercise01.lcm(0, 0));
    }

}
