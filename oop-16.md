### Static keyword

- **Static** chủ yếu dùng để quản lý bộ nhớ, cho phép biến phương thức thuộc về chính class hơn là thuộc về một thực thể của class đó. Keyword này thường dùng để chia sẻ biến hoặc method của class. Có thể sử dụng keyword này với biến, phương thức, khối và class lồng. Keyword được dùng cho constant hay phương thức giống nhau cho mọi thực thể của class.

- **Static dùng để**

  1. Biến (Dùng chung xuyên suốt mọi instance)
  2. Phương thức (Được gọi mà không cần khởi tạo object)
  3. Block (Thực thi một lần khi class được load)
  4. Nested Class

- **Static method** không thể truy cập đến non-static method bởi vì static method thuộc về class chứ không gắn với cụ thể một instance nào. Còn non-static method cần một instance cụ thể để truy cập. Vì thế nên khi gọi static method, không có đối tượng nào được tạo ra cho nên không thể gọi trực tiếp đến một non-static method

**Ví dụ:**

```java
class Example {
    void show() { System.out.println("Hello"); }
    static void test() {
        show(); // lỗi biên dịch, vì show() là non-static
    }
}
```

Muốn truy cập non-static method từ static method, cần tạo đối tượng:

```java
static void test() {
    Example obj = new Example();
    obj.show(); // hợp lệ
}
```
