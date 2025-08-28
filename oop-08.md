### Java không hỗ trợ đa kế thừa

- Java không hỗ trợ đa kế thừa là vì để ngăn chặn sự nhập nhằng và phức tạp có thể phát sinh từ việc đa kế thừa. Java chỉ cho phép một lớp được kế thừa từ một class cha duy nhất. Kế thừa đơn đảm bảo cấu trúc phân cấp rõ ràng, giúp bảo trì mã dễ dàng và giảm thiểu khả năng xung đột.

- Ví dụ về Diamond Problem:
    + Nếu một class A có method là check() class B và C kế thừa lại class A và triển khai lại method check(). Khi class D đa kế thừa lại B và C thì xung đột phát sinh vì class D không biết nên sử dụng phương thức check của B hay là C

- Để tránh đa kế thừa thì sử dụng interface. Interface cho phép một class có thể implements lại nhiều interface khác nhau