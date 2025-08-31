## Annotation

- **Annotation** là một dạng siêu dữ liệu (metadata) cung cấp thông tin bổ sung về chương trình mà không ảnh hưởng trực tiếp đến logic của chương trình. Annotation được sử dụng để cung cấp thông tin cho trình biên dịch, công cụ phát triển, hoặc các framework trong quá trình chạy ứng dụng.

  - Có thể dùng cho class, method, variable, package, parameter

  - Hai loại: Annotation được tích hợp sẵn - Annotation do người dùng tự định nghĩa

  - Dùng cho 3 mục đích chính:
    1. Chỉ dẫn cho trình biên dịch
    2. Chỉ dẫn trong thời điểm biên dịch
    3. Chỉ dẫn trong thời gian chạy

## @Override

- **@Override** là annotaion được sử dụng để chỉ định rằng một phương thức trong lớp con đang ghi đè một phương thức trong lớp cha. Nó giúp trình biên dịch kiểm tra xem phương thức đó có thực sự bị ghi đè hay không.

## @Deprecated

- **Deprecated** là từ khóa (annotation) dùng để đánh dấu một class, method hoặc field trong Java là "không nên sử dụng nữa". Khi một thành phần bị đánh dấu là deprecated, trình biên dịch sẽ cảnh báo nếu bạn sử dụng nó, nhằm khuyến khích chuyển sang giải pháp mới hoặc thay thế tốt hơn.
