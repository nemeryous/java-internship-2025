### SOLID Principles

- **SOLID** là 5 nguyên tắc quan trọng giúp cải thiện thiết kế phần mềm, làm cho mã nguồn dễ bảo trì và mở rộng hơn. Các nguyên tắc này giúp tăng cường loose coupling => giảm phụ thuộc giữa các lớp => giúp mã nguồn dễ tái sử dụng, dễ bảo trì, linh hoạt, ổn định hơn

- **S Single Responsiblity Principle** một class chỉ nên có một trách nhiệm, một công việc hoặc một mục đích duy nhất. Hay nói cách khác một class chỉ nên đảm nhận một nhiệm vụ trong hệ thống phần mềm.

```java
// Class for baking bread
class BreadBaker {
    public void bakeBread() {
        System.out.println("Baking high-quality bread...");
    }
}

// Class for managing inventory
class InventoryManager {
    public void manageInventory() {
        System.out.println("Managing inventory...");
    }
}

// Class for ordering supplies
class SupplyOrder {
    public void orderSupplies() {
        System.out.println("Ordering supplies...");
    }
}

// Class for serving customers
class CustomerService {
    public void serveCustomer() {
        System.out.println("Serving customers...");
    }
}

// Class for cleaning the bakery
class BakeryCleaner {
    public void cleanBakery() {
        System.out.println("Cleaning the bakery...");
    }
}

```

- **O Open/Closed Principle** các thực thể phần mềm như class, module, function,... nên mở để mở rộng nhưng đóng để chỉnh sửa. Có nghĩa rằng là bạn nên có khả năng mở rộng hành vi nhưng không cần sửa đổi nó
  - Ví dụ: Nếu có một class dùng đổ nhiên liệu nhưng chỉ hỗ trợ xử lí đổ xăng. Nếu muốn mở rộng đổ dầu thì thêm một class đổ nhiên liệu bằng dâu kế thừa từ class đổ nhiên liệu ở trên.
  - Nếu có một class Payment chỉ để xử lí trả tiền bằng tín dụng. Nếu muốn mở rộng để trả bằng thẻ Credit thì thêm một class CreditPayment kế thừa từ Payment

```java
// Base class for payment processing
abstract class PaymentProcessor {
    public abstract void processPayment(double amount); // Pure virtual function
}
​
// Credit card payment processor
class CreditCardPaymentProcessor extends PaymentProcessor {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing credit card payment of $" + amount);
    }
}

```

- **L Liskov's Subsitution Prinple** Nguyên tắc này được Liskov giới thiệu năm 1987, theo đó các lớp dẫn xuất (con) phải có thể thay thế lớp cơ sở (cha). Nguyên tắc này đả bảo rằng bất kỳ class con nào của class cha đều có thể sử dụng thay cho class cha mà không gây ra hành vi gây bất ngờ.
  - Ví dụ: Hình chữ nhật có bốn cạnh. Chiều cao, chiều rộng có thể là bất kỳ giá trị nào. Hình vuông cũng là một hình chữ nhật nhưng có chiều rộng và chiều cao bnagwf nhau. Vì vậy ta có thể mở rộng thuộc tính của class Rectangle thành class Square. Nhưng nếu class con Square làm thay đổi hành vi của class cha thì sẽ vi phạm nguyên tắc này

```java
// Base class for shapes
class Rectangle {
    protected double width;
    protected double height;

    public Rectangle(double w, double h) {
        this.width = w;
        this.height = h;
    }

    public double area() {
        return width * height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public void setWidth(double w) {
        this.width = w;
    }

    public void setHeight(double h) {
        this.height = h;
    }
}

// Derived class for squares
class Square extends Rectangle {
    public Square(double size) {
        super(size, size);
    }

    @Override
    public void setWidth(double w) {
        this.width = this.height = w; // Ensure both width and height remain the same
    }
}
```

- **I Interface Segregation Principle** tương tự với nguyên tắc S. Mục tiếu chính là tránh tạo ra interface quá lớn và ưu tiên nhiều interface nhỏ hơn, chuyên biệt cho từng client. Nên tạo ra nhiều interface riêng cho từng client thay vì một interface tổng quát, và mỗi interface nên có một trách nhiệm cụ thể.

* Ví dụ về gian hàng trong siêu thi. Nên chia thành các gian hàng riêng biệt: thức ăn, đồ gia dụng, giải trí,... chứ không phải bày biện lộn xộn. Chia gian hành thành các gian nhỏ hơn chuyên biệt với từng nhu cầu và mục đích.

```java
// Interface cho gian hàng thức ăn
interface FoodSection {
    void sellFood();
}

// Interface cho gian hàng đồ gia dụng
interface HouseholdSection {
    void sellHouseholdItems();
}

// Interface cho gian hàng giải trí
interface EntertainmentSection {
    void sellEntertainmentItems();
}

// Lớp gian hàng thức ăn chỉ implement FoodSection
class FoodStore implements FoodSection {
    @Override
    public void sellFood() {
        System.out.println("Bán thực phẩm tươi sống, đồ ăn nhanh...");
    }
}

// Lớp gian hàng đồ gia dụng chỉ implement HouseholdSection
class HouseholdStore implements HouseholdSection {
    @Override
    public void sellHouseholdItems() {
        System.out.println("Bán nồi, chảo, máy giặt, tủ lạnh...");
    }
}

// Lớp gian hàng giải trí chỉ implement EntertainmentSection
class EntertainmentStore implements EntertainmentSection {
    @Override
    public void sellEntertainmentItems() {
        System.out.println("Bán sách, đồ chơi, game...");
    }

```

- **D Dependency Inversion Principle** nguyên tắc này nói rằng các module cấp cao không nên phụ thuộc vào các module cấp thấp. Cả hai nên phụ thuộc vào các abtraction. Ngoài ra, abtraction không nên phụ thuộc vào chi tiết mà chi tiết nên phụ thuộc vào abstraction. Khuyến khích các class nên phụ thuộc vào abtraction (interface/abstract) thay vì phụ thuộc vào các class cụ thể. Điều này giúp code dễ linh hoạt, dễ thay đổi và giảm sự phụ thuộc giữa các phần của hệ thống

```java
// Interface for version control system
interface IVersionControl {
    void commit(String message);
    void push();
    void pull();
}

// Git version control implementation
class GitVersionControl implements IVersionControl {
    @Override
    public void commit(String message) {
        System.out.println("Committing changes to Git with message: " + message);
    }

    @Override
    public void push() {
        System.out.println("Pushing changes to remote Git repository.");
    }

    @Override
    public void pull() {
        System.out.println("Pulling changes from remote Git repository.");
    }
}

// Team class that relies on version control
class DevelopmentTeam {
    private IVersionControl versionControl;

    public DevelopmentTeam(IVersionControl vc) {
        this.versionControl = vc;
    }

    public void makeCommit(String message) {
        versionControl.commit(message);
    }

    public void performPush() {
        versionControl.push();
    }

    public void performPull() {
        versionControl.pull();
    }
}

public class Main {
    public static void main(String[] args) {
        GitVersionControl git = new GitVersionControl();
        DevelopmentTeam team = new DevelopmentTeam(git);

        team.makeCommit("Initial commit");
        team.performPush();
        team.performPull();
    }
}

```
