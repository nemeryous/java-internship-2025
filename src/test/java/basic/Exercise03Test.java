package basic;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class Exercise03Test {

    @Test
    void shouldFindPrimeFactorization_OK() {

        assertEquals("2 * 2 * 2 * 3", Exercise03.primeFactorization(24));
        assertEquals("5", Exercise03.primeFactorization(5));
        assertEquals("2 * 2 * 2 * 2", Exercise03.primeFactorization(16));

    }

}
