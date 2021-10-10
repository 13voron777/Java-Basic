package Lesson_8.BASIC_HW8.Extra;

import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();

        try {
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
                    throw new Exception();
            }
        } catch (Exception e) {
            System.out.println("Неверный знак арифметической операции!");
        }
    }
}
