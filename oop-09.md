## Annotation

- **Annotation** là một dạng chú thích hoặc một dạng siêu dữ liệu (metadata) được dùng để cung cấp thông tin dữ liệu cho mã nguồn Java. Các Annotation được sử dụng trong mã nguồn sẽ được biên dịch thành bytecode và sử dụng kĩ thuật phản chiếu dữ liệu (Reflection) để truy vấn thông tin siêu dữ liệu và đưa ra hành động thích hợp.
    + Có thể dùng cho class, method, variable, package, parameter

    + Hai loại: Annotation được tích hợp sẵn - Annotation do người dùng tự định nghĩa

    + Dùng cho 3 mục đích chính:
        1. Chỉ dẫn cho trình biên dịch
        2. Chỉ dẫn trong thời điểm biên dịch
        3. Chỉ dẫn trong thời gian chạy

## @Override

- **@Override**  là từ khóa dùng để chỉ việc ghi đè (thay thế) phương thức của lớp cha bằng phương thức mới trong lớp con. Khi một phương thức ở lớp con có cùng tên, kiểu trả về và tham số với phương thức ở lớp cha, phương thức ở lớp con sẽ được gọi thay cho phương thức ở lớp cha khi đối tượng thuộc lớp con sử dụng.

## @Deprecated

- **Deprecated** là từ khóa (annotation) dùng để đánh dấu một class, method hoặc field trong Java là "không nên sử dụng nữa". Khi một thành phần bị đánh dấu là deprecated, trình biên dịch sẽ cảnh báo nếu bạn sử dụng nó, nhằm khuyến khích chuyển sang giải pháp mới hoặc thay thế tốt hơn.
