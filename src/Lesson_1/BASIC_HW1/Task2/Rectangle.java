package Lesson_1.BASIC_HW1.Task2;

public class Rectangle {
    public double side1;
    public double side2;

    public double areaCalculator (double side1, double side2) {
        return side1 * side2;
    }

    public double perimeterCalculator (double side1, double side2) {
        return 2 * (side1 + side2);
    }
}
