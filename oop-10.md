### Anonymous Class

- **Anonymous Class** là lớp nội bộ không có tên. Vì không có tên nên chúng ta không thể sử dụng anonymous class để tạo instance ở nơi khác. Do đó anonymous class phải đượck hai báo và khởi tạo ngay tại vị trí sử dụng, trong một biểu thức duy nhất. Chugns ta có thể mở rộng một lớp có sẵn hoặc triển khai một interface khi dùng anonymous class.

- **Các thuộc tính của anonymous class**:

        1. Constructor: cú pháp của anonymous class không cho phép chúngta triển khai nhiều interface cùng lúc. Khi khởi tạo, chỉ tồn tại đúng 1 instance của anonymous class. Vì vậy anonymous class không thể là abstract class. Có thể mở rộng anonymous class vì chúng không có tên. Vì lý do này, anonymous class cũng không thể có constructor được khai báo rõ ràng

        2. Static members: Anonymous class không thể có static nào ngoại trừ các constants
          + Ví dụ trường hợp này sẽ không compile
          ``` java
          new Runnable() {
            static final int x = 0;
            static int y = 0; // compilation error!

            @Override
            public void run() {
            // ...
        }

        };
          ```
        3. Scopes Of Variables: các anonymous class có thể truy cập các biển cục bộ nằm trong phạm vị của khối mà chúng được khai báo

        ``` java
        int count = 1;
        Runnable action = new Runnable() {
          @Override
          public void run() {
            System.out.println("Runnable with captured variables: " + count);
        }
        };
        ```
        Biến count và action được định nghĩa trong cùng một khối, vì vậy có thể truy cập count từ bên trong class. Để sử dụng biển cục bộ này, chúng phải là biến có hiệu quả là final

- **Các trường hợp sử dụng Anonymous Class**:

        1. Phân cấp lớp và đóng gói: Dùng anonymous class cho các trường hợp rất đặc biệt để có cấu trúc phân cấp lớp rõ ràng hơn trong ứng dụng.
        2. Cấu trúc dự án sạch hơn: Dùng anonymous class khi cần thay đổi nhanh cách triển khai các phương thức của một số lớp. Tránh thêm mới các file *.java đặc biệt khi các lớp đó chỉ dùng một lần
        3. Lắng nghe sự kiện giao diện người dùng: Trường hợp phổ biến của anonymous class là tạo các event listener
