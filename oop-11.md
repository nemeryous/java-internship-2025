### Generics

**Generic** có nghĩa là kiểu tham số hóa. Chúng cho phép chúng ta viết code làm việc với nhiều kiểu dữ liệu khác nhau bằng một class, interface hoặc method duy nhất. Thay vì tạo các phiên bản riêng cho từng kiểu, chúng ta sử dụng tham số kiểu như `<T>` để code có thể tái sử dụng và đảm bảo an toàn kiểu dữ liệu.

---

#### Các loại generics trong Java

**1. Generic class**

```java
// Sử dụng < > để chỉ định kiểu tham số
class Test<T> {
    T obj;
    Test(T obj) {
        this.obj = obj;
    }
    public T getObject() { return this.obj; }
}

class Geeks {
    public static void main(String[] args) {
        // instance kiểu Integer
        Test<Integer> iObj = new Test<>(15);
        System.out.println(iObj.getObject());

        // instance kiểu String
        Test<String> sObj = new Test<>("GeeksForGeeks");
        System.out.println(sObj.getObject());
    }
}
```

**2. Generic method**

```java
class Geeks {
    // Ví dụ về generic method
    static <T> void genericDisplay(T element) {
        System.out.println(element.getClass().getName() + " = " + element);
    }

    public static void main(String[] args) {
        // Gọi generic method với đối số Integer
        genericDisplay(11);

        // Gọi generic method với đối số String
        genericDisplay("GeeksForGeeks");

        // Gọi generic method với đối số double
        genericDisplay(1.0);
    }
}
```

---

### Lợi ích khi sử dụng Generic

1. **Tái sử dụng code:** Viết một lần, dùng cho nhiều kiểu dữ liệu khác nhau.
2. **Đảm bảo an toàn kiểu dữ liệu:** Generics giúp phát hiện lỗi kiểu dữ liệu ngay tại thời điểm biên dịch thay vì khi chạy chương trình.
3. **Không cần ép kiểu thủ công:** Khi lấy dữ liệu ra, không cần ép kiểu về kiểu mong muốn.
4. **Thúc đẩy khả năng tái sử dụng code:** Có thể viết các thuật toán (ví dụ sắp xếp) cho nhiều kiểu dữ liệu mà không cần viết lại cho từng kiểu.