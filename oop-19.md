### Try-catch

- Khối lệnh `try-catch` dùng để xử lý ngoại lệ (exception) trong Java. Khi đoạn mã trong khối `try` phát sinh lỗi, chương trình sẽ chuyển sang khối `catch` để xử lý lỗi đó, tránh làm chương trình bị dừng đột ngột

```java
try {
    int a = 10 / 0; // lỗi chia cho 0
} catch (ArithmeticException e) {
    System.out.println("Có lỗi xảy ra: " + e.getMessage());
}
```

### Try-with-resource (try-catch-resource)

- Khối lệnh `try-catch-resource` được giới thiệu từ Java 7, cho phép chúng ta xác định tài nguyên được dùng ở khối `try`, đảm bảo răng các tài nguyên này sẽ được đóng sau khi khối `try` được thực thi hoàn thành. Để có thể tự động đóng thì tài nguyên phải được khai báo trong `try`. Dùng để thay thế `try-catch-finally`.

```java
try (PrintWriter writer = new PrintWriter(new File("test.txt"))) {
    writer.println("Hello World");
}
```

```java
try (Scanner scanner = new Scanner(new File("test.txt"))) {
    while (scanner.hasNext()) {
        System.out.println(scanner.nextLine());
    }
} catch (FileNotFoundException fnfe) {
    fnfe.printStackTrace();
    // Scanner will be closed after the excution of try block.
```
