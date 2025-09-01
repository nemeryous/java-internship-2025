### DI - Dependency Injection

- **Dependency Injection** (tiêm phụ thuộc) là một kĩ thuật mạnh mẽ giúp quản lý phụ thuộc giữa các class. Nhằm mục đích tách rời các class khỏi các phụ thuộc của chúng, làm cho mã nguồn linh hoạt hơn, dễ kiểm thử và dễ bảo trì.

```java

// Không dùng DI
class Service {
  private Repository repo = new Repository();
}

// Dùng DI
class Service {
  private Repository repo;

  public Service(Repository repo) {
    this.repo = repo;
  }
}

```

- DI xoay quanh quá trình đơn giản là các phụ thuộc được tiêm từ một nguồn bên ngoài. Trong OOP, phụ thuộc có thể được hiểu là những thực thế cung cấp một chức năng nhất định cho đối tượng khác

- Cùng với Interface Segregation có thể làm code trở nên linh hoạt dễ thay đổi.

```java
// Interface chuyên biệt cho từng loại repository
interface UserRepository {
    void saveUser(User user);
}

// Cài đặt cụ thể cho từng repository
class SqlUserRepository implements UserRepository {
    public void saveUser(User user) {
        System.out.println("Lưu user vào database SQL");
    }
}

class MongoUserRepository implements UserRepository {
  public void saveUser(User user) {
        System.out.println("Lưu user vào MongoDb");
    }
}

// Service sử dụng DI để nhận repository phù hợp
class UserService {
    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void register(User user) {
        userRepository.saveUser(user);
    }
}
```


### IoC - Inversion of Control

- **IoC** là một nguyên lý trong kĩ thuật phần mềm, chuyển quyền kiểm soaats các đối tượng hoặc một phần chương trình sang cho một container hoặc framework. IoC thường được dùng trong lập trình hướng đối tướng.

  + Ưu điểm:
    1. Tách biệt việc thực thi một nhiệm vụ khỏi cách triển khai của nó
    2. Dễ dàng chuyển đổi giữa các cách triển khai khác nhau
    3. Tăng tính module cho chương trình
    4. Dễ kiểm thửu hơn bằng cách cô lập một thành phần hoặc giả lập các phụ thuộc, cho phép các thành phần giao tiếp thông qua hợp đồng

- **Mối quan hệ giữa DI và IoC**: IoC là nguyên lý tổng quát, còn DI là kĩ thuật lập trình cụ thể. DI là một cách để triển khai, thực hiện IoC.
