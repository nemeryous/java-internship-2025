# Design Pattern

## Định nghĩa

- **Design Pattern** là những giải pháp điển hình cho các vấn đề thường gặp trong thiết kế phần mềm. Chúng giống như những bản thiết kế được tạo sẵn mà chúng ta có thể tuỳ chỉnh để giải quyết một vấn đề thường gặp trong mã của mình

## Phân loại

1. **Creational Patterns (Nhóm khởi tạo)**

   - Cung cấp các kĩ thuật khởi tạo đối tượng, nó gia tăng tính linh hoạt và tái sử dụng của các đoạn mã
   - Factory Method, Abstract Factory, Builder, Prototype, Singleton

2. **Structural Pattern (Nhóm cấu trúc)**

   - Cách để lắp ráp, tổ chức các đối tượng, class vào một cấu trúc lớn hơn, trong khi đó giữ cho những cấu trúc này linh hoạt và hiệu quả
   - Adapter, Bridge, Composite, Decorator, Facade, Proxy, Flyweight

3. **Behavior Pattern (Nhóm hành vi)**
   - Liên quan đến thuật toán và việc phân công công việc, trách nhiệm giữa các đối tượng
   - Observer, Chain of Responsibility, Command, Iterator, Mediator, Memento, State,...

## Singleton Pattern

- Là một mẫu khởi tạo, chắc chắn rằng một class chỉ có một thực thể duy nhất, trong khi đó cung cấp một điểm truy cập toàn cục đến thực thể này.

- Singleton Pattern giải quyết 2 vấn đề cùng một lúc, điều này vi phạm Single Responsibility Principle

  1. Chắc chắn rằng một class chỉ có một instance được sinh ra. Nhằm mục đích để kiểm soát truy cập đến các tài nguyên dùng chung như là database, file,...

  2. Cung cấp một điểm truy cập toàn cục đến instance. Cho phép truy cập đối tượng từ bất cứ đâu trong chương trình đồng thời cũng bảo vệ những instances này khỏi bị ghi đề bởi các đoạn mã khác

- Implementation:
  - Để cài đặt Singleton Pattern thường trải qua 2 bước:
    1. Để constructor mặc định là private, để tránh những đối tượng khác sử dụng toán tử `new` với những class Singleton
    2. Tạo một phương thức khởi tạo static, hoạt động như một constructor. Bên trong, phương thức này gọi hàm tạo riêng để tạo một đối tượng và lưu nó vào một field static. Tất cả lệnh gọi đến phương thức này đều được trả về đối tượng đã được lưu.

```java
public class Singleton {
    private static Singleton instace;

    private Singleton() {}

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }

        return instance;
    }
}
```

## Adapter

- Là một mẫu cấu trúc, cho phép các đối tượng có interface không tương thích với nhau, hợp tác với nhau

- Pattern này giúp các lớp với interface khác nhau có thể làm việc mà không cần sửa đổi code gốc. Thường dùng khi tích hợp hệ thống cũ với hệ thống mới, hoặc khi sử dụng thư viện bên ngoài không thể chỉnh sửa.

- **Giải pháp**

  - Tạo một adapter. Đây là một đối tượng đặc biệt, chuyển đổi interface của một đối tượng sao cho các đối tượng khác có thể hiểu
  - Adapter bọc một đối tượng để ẩn đi sự phức tạp của việc chuyển đổi
  - Cách hoạt động
    1. Adapter nhận một interface tương thích với một trong các đối tượng hiện có
    2. Sử dụng interface này, đối tượng hiện có có thể gọi các phương thức của adapter một cách an toàn
    3. Khi nhận được lời gọi, adapter sẽ chuyển tiếp yêu cầu đến đối tượng thứ hai, những ở định dạng và thứ tự mà đối tượng thứ 2 mong đợi
    4. Có thể tạo adapter 2 chiều để chuyển đổi các lời gọi theo các 2 hướng

- **Ví dụ**: Khi đi du lịch từ USA qua Đức, thì sạc laptop của USA không thể cắm vào ổ cắm điện của Đức, vì chuẩn của mỗi nước là khác nhau, điều này có thể giải quyết bằng một bộ chuyển đổi.

```java
interface VietnameseTarget {
    void send(String words);
}

class JapaneseAdaptee {
    void receive(String words) {
        System.out.println(words);
    }
}

class TranslatorAdaptor implements VietnameseTarget {

    private JapaneseAdaptee adaptee;

    public TranslatorAdapter(JapaneseAdaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    void send(String words) {
        String japaneseWords = this.translate(words);
        adaptee.receive(japaneseWords)
    }

    private String translate(String vietnameseWords) {
        System.out.println("Translated!");
        return "こんにちは";
    }
}

```
