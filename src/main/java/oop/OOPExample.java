package oop;

public class OOPExample {

    // Tính đóng gói (Encapsulation)
    public static class Animal {
        private String name;

        public Animal(String name) {
            this.name = name;
        }

        // Getter
        public String getName() {
            return name;
        }

        // Setter
        public void setName(String name) {
            this.name = name;
        }

        public void barks() {
            System.out.println(getName() + " barks!");
        }

    }

    // Tính kế thừa (Inheritance)
    public static class Dog extends Animal {
        public Dog(String name) {
            super(name);
        }

        // Tính đa hình - Override
        @Override
        public void barks() {
            System.out.println(getName() + " says Woof!");
        }
    }

    public static class Calculator {

        public int add(int a, int b) {
            return a + b;
        }

        // Tính đa hình - Overloading
        public int add(int a, int b, int c) {
            return a + b + c;
        }
    }

    // Tính trừu tượng
    static abstract class Shape {
        abstract double area();
    }

    static class Circle extends Shape {
        private double radius;

        public Circle(double radius) {
            this.radius = radius;
        }

        @Override
        double area() {
            return Math.PI * radius * radius;
        }
    }

    static class Rectangle extends Shape {
        private double width;
        private double height;

        public Rectangle(double width, double height) {
            this.width = width;
            this.height = height;
        }

        @Override
        double area() {
            return width * height;
        }
    }

    public static void main(String[] args) {
        Animal dog = new Dog("Buddy");
        dog.barks();

        Shape circle = new Circle(5);
        System.out.println("Area of circle: " + circle.area());

        Shape rectangle = new Rectangle(4, 6);
        System.out.println("Area of rectangle: " + rectangle.area());
    }

}
