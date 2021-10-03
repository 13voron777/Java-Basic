package Lesson_2.BASIC_HW2.Task2;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car("Blue");
        Car car3 = new Car("Aquamarine", 3);

        System.out.println("Car1: " + car1.getColor() + " " + car1.getAge());
        System.out.println("Car2: " + car2.getColor() + " " + car2.getAge());
        System.out.println("Car3: " + car3.getColor() + " " + car3.getAge());
    }
}
