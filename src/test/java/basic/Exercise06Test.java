package basic;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class Exercise06Test {

    @Test
    void shouldGetMonthName_OK() {

        assertEquals(Exercise06.getMonthName(1), "Tháng Một");
        assertEquals(Exercise06.getMonthName(2), "Tháng Hai");
        assertEquals(Exercise06.getMonthName(3), "Tháng Ba");
        assertEquals(Exercise06.getMonthName(4), "Tháng Tư");
        assertEquals(Exercise06.getMonthName(5), "Tháng Năm");
        assertEquals(Exercise06.getMonthName(6), "Tháng Sáu");
        assertEquals(Exercise06.getMonthName(7), "Tháng Bảy");
        assertEquals(Exercise06.getMonthName(8), "Tháng Tám");
        assertEquals(Exercise06.getMonthName(9), "Tháng Chín");
        assertEquals(Exercise06.getMonthName(10), "Tháng Mười");
        assertEquals(Exercise06.getMonthName(11), "Tháng Mười Một");
        assertEquals(Exercise06.getMonthName(12), "Tháng Mười Hai");
        assertEquals(Exercise06.getMonthName(0), "Số không hợp lệ");
        assertEquals(Exercise06.getMonthName(13), "Số không hợp lệ");
    }
}
