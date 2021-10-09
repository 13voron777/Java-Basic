package Lesson_4.BASIC_LAB4.LR_2;

public class Rectangle extends Figure {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double square() {
        return length * width;
    }
}
