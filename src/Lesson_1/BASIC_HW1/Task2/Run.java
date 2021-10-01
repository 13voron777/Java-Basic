package Lesson_1.BASIC_HW1.Task2;

import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Rectangle rectangle = new Rectangle();
        System.out.print("Введите длину прямоугольника: ");
        rectangle.side1 = scanner.nextDouble();
        System.out.print("Введите ширину прямоугольника: ");
        rectangle.side2 = scanner.nextDouble();

        System.out.println("Периметр прямоугольника: " + rectangle.perimeterCalculator(rectangle.side1, rectangle.side2));
        System.out.println("Площадь прямоугольника: " + rectangle.areaCalculator(rectangle.side1, rectangle.side2));
    }
}
