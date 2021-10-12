package Lesson_8.BASIC_LAB8.Extra;

public class Calculator {
    private double a;
    private double b;

    public Calculator(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public void add(double a, double b) {
        System.out.println(a + " + " + b + " = " + (a + b));
    }

    public void sub(double a, double b) {
        System.out.println(a + " - " + b + " = " + (a - b));
    }

    public void mul(double a, double b) {
        System.out.println(a + " * " + b + " = " + (a * b));
    }

    public void div(double a, double b) {
        try {
            if (b == 0) {
                throw new ArithmeticException();
            }
            System.out.println(a + " / " + b + " = " + (a / b));
        } catch (ArithmeticException e) {
            System.out.println("Делить на 0 нельзя!");
        }
    }
}