package oop;

public class ClassAndObject {
    
    // Lớp: Mẫu của xe
    static class Car {
        private String color;

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public void drive() {
            System.out.println("The " + color + " car is driving.");
        }
    }

    public static void main(String[] args) {
        Car car1 = new Car(); // Đối tượng car1
        car1.setColor("red");
        car1.drive();

        Car car2 = new Car(); // Đối tượng car2
        car2.setColor("blue");
        car2.drive();
    }
}
