package Lesson_2.BASIC_LAB2.LAB2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите радиус круга: ");
        MyArea.myArea(scanner.nextDouble());
    }
}
