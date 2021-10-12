package Lesson_6.BASIC_HW6.Extra;

public class Run {
    public static void main(String[] args) {
        Calculator calculator = new Calculator(10, 2);
        System.out.println("Сумма: " + calculator.sum());
        System.out.println("Разность: " + calculator.diff());
        System.out.println("Произведение: " + calculator.mult());
        System.out.println("Деление: " + calculator.div());
        System.out.println("Остаток от деления: " + calculator.mod());
        System.out.println();

        System.out.println("Static Сумма: " + StaticCalculator.sum(10, 6));
        System.out.println("Static Разность: " + StaticCalculator.diff(10, 6));
        System.out.println("Static Произведение: " + StaticCalculator.mult(10, 6));
        System.out.println("Static Деление: " + StaticCalculator.div(10, 6));
        System.out.println("Static Остаток от деления: " + StaticCalculator.mod(10, 6));
    }
}
