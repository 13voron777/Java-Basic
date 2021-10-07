package Lesson_3.BASIC_HW3.Task3;

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle1 = new Car(1, 2, 120, 200, 2000);
        Vehicle vehicle2 = new Plane(5, 6, 10000, 900, 2020, 10000, 700);
        Vehicle vehicle3 = new Ship(7, 9, 8000, 100, 2015, 30, "Barcelona");

        System.out.println(vehicle1 + "\n" + vehicle2 + "\n" + vehicle3);
    }
}
