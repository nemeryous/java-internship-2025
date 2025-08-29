package basic;

public class Exercise07 {
    public static int reverseBinary(final int n) {
        if (n == 0) {
            return 0;
        }

        int temp = n;
        int newNumber = 0;

        while (temp > 0) {
            final int bit = temp & 1;
            newNumber = (newNumber << 1) | bit;
            temp >>= 1;
        }

        return newNumber;
    }
}
