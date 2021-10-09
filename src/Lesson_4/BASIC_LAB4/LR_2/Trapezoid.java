package Lesson_4.BASIC_LAB4.LR_2;

public class Trapezoid extends Figure {
    private double length;
    private double width;
    private double height;

    public Trapezoid(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    @Override
    public double square() {
        return height * (length + width) / 2;
    }
}
