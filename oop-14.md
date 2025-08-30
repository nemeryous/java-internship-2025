### Super Keyword in Java

- **Tác dụng**: Từ khoá super dùng để tham chiếu đối đến tượng của lớp cha. Nó được sử dụng để gọi đến các phương thức/biến của lớp cha và truy cập constructor của lớp cha. Các sử dụng phổ biển nhất là nhằm loại bỏ sự nhầm lẫn giữa lớp cha và lớp con khi cả hai đều có phương thức trùng tên.

```java
class Animal {
  int x = 10;
  public void animalSound() {
    System.out.println("The animal makes a sound");
  }
}

class Dog extends Animal {
  public void animalSound() {
    super.animalSound();
    System.out.println("The dog says: bow wow");
    System.out.println(super.x);
  }
}

public class Main {
  public static void main(String args[]) {
    Animal myDog = new Dog();
    myDog.animalSound();
  }
}
```

- **Khi nào bắt buộc phải dùng `super`:**
  - Khi muốn gọi constructor của lớp cha trong constructor của lớp con.
  - Khi lớp con có biến hoặc phương thức trùng tên với lớp cha và muốn truy cập thành viên của lớp cha.
