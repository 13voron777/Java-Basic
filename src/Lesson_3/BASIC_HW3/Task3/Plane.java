package Lesson_3.BASIC_HW3.Task3;

public class Plane extends Vehicle {
    int height;
    int countPas;

    public Plane(int x, int y, double price, double speed, int year, int height, int countPas) {
        super(x, y, price, speed, year);
        this.height = height;
        this.countPas = countPas;
    }

    @Override
    public String toString() {
        return super.toString() + " " + this.height + " " + this.countPas;
    }
}
