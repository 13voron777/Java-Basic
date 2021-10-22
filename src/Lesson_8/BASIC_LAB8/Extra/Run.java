package Lesson_8.BASIC_LAB8.Extra;

import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            double a = scanner.nextDouble();
            double b = scanner.nextDouble();
            String sign = scanner.next();
            Calculator calculator = new Calculator(a, b);
            switch (sign) {
                case "+":
                    calculator.add(a, b);
                    break;
                case "-":
                    calculator.sub(a, b);
                    break;
                case "*":
                    calculator.mul(a, b);
                    break;
                case "/":
                    calculator.div(a, b);
                    break;
                default:
                    System.out.println("Неверный знак арифметической операции!");
            }
        } catch (Exception e) {
            System.out.println("Неверный ввод!");
        }
    }
}