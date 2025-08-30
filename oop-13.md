### Instance Of In Java

`instanceof` là từ khóa dùng để kiểm tra một đối tượng có phải là instance (đối tượng) của một class hoặc interface cụ thể hay không.  
Nếu đối tượng thuộc kiểu cần kiểm tra, biểu thức trả về `true`, ngược lại trả về `false`.

**Cú pháp:**

```java
object instanceof ClassName
```

- `object`: đối tượng cần kiểm tra
- `ClassName`: tên class hoặc interface cần kiểm tra

**Ví dụ:**

```java
String s = "Hello";
if (s instanceof String) {
    System.out.println("s là kiểu String");
}
```

`instanceof` thường dùng để kiểm tra kiểu đối tượng trước khi ép kiểu (casting) để tránh lỗi khi chạy chương trình.
