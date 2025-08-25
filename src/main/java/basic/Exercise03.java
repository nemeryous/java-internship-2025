package basic;

public class Exercise03 {
    public static String primeFactorization(int n) {
        StringBuilder result = new StringBuilder();
        for (int i = 2; i <= n; i++) {
            while (n % i == 0) {
                if (result.length() > 0)
                    result.append(" * ");
                result.append(i);
                n /= i;
            }
        }
        return result.toString();
    }
}
