## Annotation

- **Annotation** là một dạng chú thích hoặc một dạng siêu dữ liệu (metadata) được dùng để cung cấp thông tin dữ liệu cho mã nguồn Java. Các Annotation được sử dụng trong mã nguồn sẽ được biên dịch thành bytecode và sử dụng kĩ thuật phản chiếu dữ liệu (Reflection) để truy vấn thông tin siêu dữ liệu và đưa ra hành động thích hợp.
    + Có thể dùng cho class, method, variable, package, parameter

    + Hai loại: Annotation được tích hợp sẵn - Annotation do người dùng tự định nghĩa

    + Dùng cho 3 mục đích chính:
        1. Chỉ dẫn cho trình biên dịch
        2. Chỉ dẫn trong thời điểm biên dịch
        3. Chỉ dẫn trong thời gian chạy

## @Override

- **@Override** được sử dụng cho các phương thức có nghĩa là ghi đè phương thức trong lớp cha

## @Deprecated

- **Deprecated** được sử dụng để đánh dấu một class/method/field và chỉ dẫn rằng tốt nhất nó không nên được sử dụng nữa