- **Biến (local variable):** Khi khai báo biến với từ khóa `final`, giá trị của biến đó không thể thay đổi sau khi gán lần đầu tiên.

  ```java
  final int x = 5;
  x = 10; // lỗi biên dịch
  ```

- **Field (biến thành viên):** Nếu một field được khai báo là `final`, giá trị của field đó không thể thay đổi sau khi khởi tạo (thường dùng cho hằng số).

  ```java
  public final String NAME = "Java";
  ```

- **Parameter của hàm:** Nếu một tham số của hàm được khai báo là `final`, giá trị của tham số đó không thể bị thay đổi bên trong hàm.

  ```java
  public void setValue(final int value) {
      value = 10; // lỗi biên dịch
  }
  ```

- **Method:** Nếu một phương thức được khai báo là `final`, phương thức đó không thể bị override ở lớp con.

  ```java
  public final void show() { ... }
  ```

- **Class:** Nếu một class được khai báo là `final`, class đó không thể bị kế thừa bởi bất kỳ class nào khác.
  ```java
  public final class MyClass { ... }
  ```

**Tóm lại:**  
`final` dùng để ngăn chặn việc thay đổi giá trị hoặc hành vi, giúp tăng tính an toàn và ổn định cho chương trình.
