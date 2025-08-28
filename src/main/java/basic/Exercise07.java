package basic;

public class Exercise07 {
    public static int reverseBinary(final int n) {

        if (n == 0) {
            return 0;
        }

        StringBuilder binary = new StringBuilder();
        int temp = n;

        while (temp > 0) {
            binary.append(temp & 1);
            temp >>= 1;
        }

        int newNumber = 0;
        for (int i = binary.length() - 1; i >= 0; i--) {
            int bit = binary.charAt(i) - '0';
            System.out.println(bit);
            newNumber += bit * (int) Math.pow(2, binary.length() - 1 - i);
        }

        return newNumber;
    }
}
