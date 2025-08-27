package basic;

import java.util.ArrayList;
import java.util.List;

public class Exercise04 {

    public static List<Integer> fibonacciList(final int n) {

        final List<Integer> result = new ArrayList<>();
        int a = 1;
        int b = 1;

        if (n >= 1) {

            result.add(a);
            result.add(b);

        }

        while (a + b <= n) {

            int next = a + b;
            result.add(next);
            a = b;
            b = next;

        }

        return result;

    }

}
