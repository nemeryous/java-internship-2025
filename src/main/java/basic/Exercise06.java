package basic;

public class Exercise06 {

    private static final String[] months = {
            "Tháng Một", "Tháng Hai", "Tháng Ba", "Tháng Tư", "Tháng Năm", "Tháng Sáu",
            "Tháng Bảy", "Tháng Tám", "Tháng Chín", "Tháng Mười", "Tháng Mười Một", "Tháng Mười Hai"
    };

    public static String getMonthName(final int month) {

        if (month >= 1 && month <= 12) {
            return months[month - 1];
        }

        return "Số không hợp lệ";

    }
}
