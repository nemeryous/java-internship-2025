### This Keyword In Java

- **Từ khoá this** trong java là một biến tham chiếu đến object hiện tại.

- **Tác dụng**

  1. Gọi phương thức và thuộc tính của instance hiện tại
  2. Để truyền instance của class hiện tại như là một tham số
  3. Phân biệt giữa field và tham số truyền vào

- **Các trường hợp phải dùng `this`**

  1. Dùng `this` tham chiếu đến đến biến của instance của class hiện tại

  ```java
  class Geeks {
    int a;
    int b;

    // Parameterized constructor
    Geeks(int a, int b)
    {
        this.a = a;
        this.b = b;
    }

    void display()
    {
        // Displaying value of variables a and b
        System.out.println("a = " + a + "  b = " + b);
    }

    public static void main(String[] args)
    {
        Geeks object = new Geeks(10, 20);
        object.display();
    }
  }
  ```

  2. Dùng `this()` để gọi constructor của class hiện tại

  ```java
  class Geeks {
    int a;
    int b;

    // Default constructor
    Geeks()
    {
        this(10, 20);
        System.out.println(
            "Inside  default constructor \n");
    }

    // Parameterized constructor
    Geeks(int a, int b)
    {
        this.a = a;
        this.b = b;
        System.out.println(
            "Inside parameterized constructor");
    }

    public static void main(String[] args)
    {
        Geeks object = new Geeks();
    }
  }
  ```

  3. Dùng `this` để trả về instance của class hiện tại

  ```java
  // Java program for using "this" keyword
  // to return the current class instance
  class Geeks {
    int a;
    int b;

    // Default constructor
    Geeks()
    {
        a = 10;
        b = 20;
    }

    // Method that returns current class instance
    Geeks get() {
        return this;
    }

    // Displaying value of variables a and b
    void display()
    {
        System.out.println("a = " + a + "  b = " + b);
    }

    public static void main(String[] args)
    {
        Geeks object = new Geeks();
        object.get().display();
    }
  }

  ```

  4. Dùng `this` như là một tham số của phương thức

  ```java
  // Java program for using "this"
  // keyword as method parameter
  class Geeks {
    int a;
    int b;

    // Default constructor
    Geeks()
    {
        a = 10;
        b = 20;
    }

    // Method that receives "this"
    // keyword as parameter
    void display(Geeks obj)
    {
        System.out.println("a = " + obj.a
                           + "  b = " + obj.b);
    }

    // Method that returns current class instance
    void get() {
        display(this);
    }

    // main function
    public static void main(String[] args)
    {
        Geeks object = new Geeks();
        object.get();
    }
  }
  ```

  5. Dùng `this` để gọi đến phương thức của class hiện tại

  ```java
  // Java program for using this to invoke current
  // class method
  class Geeks {

    void display()
    {
        // calling function show()
        this.show();

        System.out.println("Inside display function");
    }

    void show()
    {
        System.out.println("Inside show function");
    }

    public static void main(String args[])
    {
        Geeks g1 = new Geeks();
        g1.display();
    }
  }
  ```

  6. Dùng `this` như là đối số của lệnh gọi constructor

  ```java
  // Java program for using this as an
  // argument in constructor call
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
