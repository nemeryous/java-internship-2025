### Hướng đối tượng

Hướng đối tượng (Object-Oriented Programming - OOP) là mô hình tập trung vào **đối tượng** (objects) và **lớp** (classes), giúp tổ chức code một cách logic, dễ bảo trì và mở rộng.

Các nguyên lí cơ bản của OOP:

- **Tính trừu tượng** (Abstraction): là quá trình ẩn chi tiết triển khai và chỉ lộ ra chức năng cho người dùng. Người dùng chỉ biết "nó làm gì" chứ không phải biết "nó làm như thế nào". Ví dụ, tài xế lái xe sẽ tập trung vào chức năng của xe (Khởi động, tăng tốc, dừng, phanh, ...) chứ không quan tâm tới cách hoạt động bên trong
    + Có 2 cách đạt được abstraction trong Java:
        * Abstract Class
        * Interface

- **Tính đóng gói** (Encapsulation): là quá trình đóng gói dữ liệu bên trong lớp, chỉ truy cập qua phương thức công khai. Bảo vệ dữ liệu khỏi thay đổi ngoài ý muốn.
    + Để đạt được tính đóng gói trong Java:
        * Khai báo private cho thuộc tính
        * Khai báo getter/setter để get và set cho thuộc tính

- **Tính kế thừa** (Inheritance): là quá trình một lớp kế thừa lại thuộc tính và phương thức của lớp khác. Sử dụng từ khoá extends

- **Tính đa hình** (Polymorphism): là kĩ thuật để biểu diễn nhiều thứ theo nhiều cách khác nhau. Tính đa hình có thể được biểu diễn trong trường hợp của kế thừa. Hàm được thực thi theo nhiều cách dựa vào cách cài đặt được thực sự triển khai.
    
    + Có 2 loại đa hình
         * Static / Compile-time
            + Compiler xác định hàm thực tế tại thời điểm biên dịch
            + Overloading: Các hàm trong cùng một lớp có cùng tên nhưng khác số lượng hoặc kiểu tham số
        * Dynamic / Run-time
            + Quyết định tại thời điểm chạy
            + Overriding: Phương thức trong lớp con có cùng tên, kiểu trả về và tham số với lớp cha