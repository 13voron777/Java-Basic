package Lesson_3.BASIC_HW3.Task3;

public class Ship extends Vehicle {
    int height;
    String port;

    public Ship(int x, int y, double price, double speed, int year, int height, String port) {
        super(x, y, price, speed, year);
        this.height = height;
        this.port = port;
    }

    @Override
    public String toString() {
        return super.toString() + " " + this.height + " " + this.port;
    }
}
