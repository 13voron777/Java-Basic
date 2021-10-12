package Lesson_6.BASIC_LAB6.Extra;

public class Calculator {
    private double a;
    private double b;

    public Calculator(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double sum() {
        return a + b;
    }

    public double diff() {
        return a - b;
    }

    public double mult() {
        return a * b;
    }

    public double div() {
        return a / b;
    }

    public double mod() {
        return a % b;
    }
}
