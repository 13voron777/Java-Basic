package Lesson_3.BASIC_HW3.Task3;

public class Vehicle {
    int x;
    int y;
    double price;
    double speed;
    int year;

    public Vehicle(int x, int y, double price, double speed, int year) {
        this.x = x;
        this.y = y;
        this.price = price;
        this.speed = speed;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "x=" + x +
                ", y=" + y +
                ", price=" + price +
                ", speed=" + speed +
                ", year=" + year +
                '}';
    }
}
