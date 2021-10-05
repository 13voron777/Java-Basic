package Lesson_2.BASIC_HW2.Task2;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car("Blue");
        Car car3 = new Car("Aquamarine", 3);

        System.out.println("Car1: Color: " + car1.getColor() + "\t Age: " + car1.getAge());
        System.out.println("Car2: Color: " + car2.getColor() + "\t Age: " + car2.getAge());
        System.out.println("Car3: Color: " + car3.getColor() + "\t Age: " + car3.getAge());
    }
}
