| Tiêu chí         | Class                     | Abstract Class              | Interface                            |
| ---------------  | ------------------------- | --------------------------- | ---------------------------------- |
| **Khởi tạo**     | Có thể dùng `new`         | Không thể dùng `new`        | Không thể dùng `new`               |
| **Phương thức** | Cụ thể (có body)          | Có thể abstract hoặc cụ thể | Abstract (không body, trừ default) |
| **Thuộc tính**  | Có thể có instance/static | Có thể có instance/static   | Chỉ hằng số (public static final)  |
| **Kế thừa**     | Kế thừa đơn (extends)     | Kế thừa đơn (extends)       | Đa kế thừa (implements nhiều)      |
| **Constructor** | Có                        | Có                          | Không                              |
| **Trừu tượng**  | 0% (cụ thể)               | 0-100%                      | 100%                               |
| **Từ khóa**     | `class`                   | `abstract class`            | `interface`                        |
