package basic;

public class Exercise07 {
    public static int reverseBinary(int n) {
        String binary = Integer.toBinaryString(n);
        String reversed = new StringBuilder(binary).reverse().toString();
        return Integer.parseInt(reversed, 2);
    }
}
