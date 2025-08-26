package basic;

public class Exercise01 {
    public static int findGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static int findLCM(int a, int b) {
        if (a == 0 || b == 0)
            return 0;
        return a * b / findGCD(a, b);
    }
}
