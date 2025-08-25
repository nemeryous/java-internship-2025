package basic;

import java.util.ArrayList;
import java.util.List;

public class Exercise04 {
    public static List<Integer> fibonacciList(int n) {
        List<Integer> result = new ArrayList<>();
        int a = 1, b = 1;
        if (n >= 1)
            result.add(a);
        if (n >= 1)
            result.add(b);
        while (true) {
            int next = a + b;
            if (next > n)
                break;
            result.add(next);
            a = b;
            b = next;
        }
        return result;
    }
}
