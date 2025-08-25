package basic;

public class Exercise06 {
    public static String getMonthName(int month) {
        switch (month) {
            case 1:
                return "Tháng Một";
            case 2:
                return "Tháng Hai";
            case 3:
                return "Tháng Ba";
            case 4:
                return "Tháng Tư";
            case 5:
                return "Tháng Năm";
            case 6:
                return "Tháng Sáu";
            case 7:
                return "Tháng Bảy";
            case 8:
                return "Tháng Tám";
            case 9:
                return "Tháng Chín";
            case 10:
                return "Tháng Mười";
            case 11:
                return "Tháng Mười Một";
            case 12:
                return "Tháng Mười Hai";
            default:
                return "Số không hợp lệ";
        }
    }
}
