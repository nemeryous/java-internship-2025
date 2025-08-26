package string;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class ExerciseString02Test {

    @Test
    void testSumOfIntegersInString() {
        assertEquals(6, ExerciseString02.sumOfIntegersInString("1 2 3"));
        assertEquals(0, ExerciseString02.sumOfIntegersInString("abc"));
        assertEquals(6, ExerciseString02.sumOfIntegersInString("1 abc 2 def 3"));
        assertEquals(156, ExerciseString02.sumOfIntegersInString("abc 123 def 33 mn 3.221"));
        assertEquals(0, ExerciseString02.sumOfIntegersInString(""));
        assertEquals(0, ExerciseString02.sumOfIntegersInString("abc123"));
        assertEquals(0, ExerciseString02.sumOfIntegersInString("3.14 2.71"));
        assertEquals(10, ExerciseString02.sumOfIntegersInString("10"));
        assertEquals(0, ExerciseString02.sumOfIntegersInString("a1b"));
        assertEquals(100, ExerciseString02.sumOfIntegersInString("abc 100 xyz"));
    }
}
