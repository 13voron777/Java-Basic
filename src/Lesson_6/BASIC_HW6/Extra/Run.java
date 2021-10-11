package Lesson_6.BASIC_HW6.Extra;

public class Run {
    public static void main(String[] args) {
        Calculator calculator = new Calculator(10, 2);
        System.out.println("Сумма: " + calculator.sum());
        System.out.println("Разность: " + calculator.diff());
        System.out.println("Произведение: " + calculator.mult());
        System.out.println("Деление: " + calculator.div());
        System.out.println("Остаток от деления: " + calculator.mod());
    }
}
