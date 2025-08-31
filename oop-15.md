### This Keyword In Java

- **Từ khoá this** trong java là một biến tham chiếu đến object hiện tại.

- **Tác dụng**

  1. Gọi phương thức và thuộc tính của instance hiện tại
  2. Để truyền instance của class hiện tại như là một tham số
  3. Phân biệt giữa field và tham số truyền vào

# Từ khoá `this` trong Java

`this` là một biến tham chiếu đến đối tượng hiện tại của class.

---

## Tác dụng

1. Gọi phương thức và thuộc tính của instance hiện tại.
2. Truyền instance của class hiện tại như là một tham số.
3. Phân biệt giữa field và tham số truyền vào khi trùng tên.
4. Gọi constructor khác trong cùng class.
5. Trả về instance hiện tại.

---

## Các trường hợp sử dụng `this`

### 1. Phân biệt giữa biến thành viên và tham số truyền vào

```java
class Student {
    private String name;
    public Student(String name) {
        this.name = name; // 'this' phân biệt biến thành viên và tham số
    }
}
```

### 2. Gọi constructor khác trong cùng class

```java
class Student {
    private String name;
    public Student() {
        this("Unknown"); // gọi constructor khác
    }
    public Student(String name) {
        this.name = name;
    }
}
```

### 3. Trả về instance hiện tại

```java
class Student {
    public Student getSelf() {
        return this;
    }
}
```

### 4. Truyền chính đối tượng hiện tại cho method hoặc constructor khác

```java
class Student {
    public void printSelf(Student s) {
        System.out.println(s);
    }
    public void callPrint() {
        printSelf(this);
    }
}
```

### 5. Gọi phương thức khác của class hiện tại

```java
class Student {
    public void show() {
        System.out.println("Show");
    }
    public void display() {
        this.show(); // gọi phương thức show
    }
}
```
  // Class with object of Class B as its data member
  class A {
    B obj;

    // Parameterized constructor with object of B
    // as a parameter
    A(B obj)
    {
        this.obj = obj;

        // calling display method of class B
        obj.display();
    }
  }
  ```

class B {
int x = 5;

    // Default Constructor that create an object of A
    // with passing this as an argument in the
    // constructor
    B() { A obj = new A(this); }

    // method to show value of x
    void display()
    {
        System.out.println("Value of x in Class B : " + x);
    }

    public static void main(String[] args)
    {
        B obj = new B();
    }

}

```

```
