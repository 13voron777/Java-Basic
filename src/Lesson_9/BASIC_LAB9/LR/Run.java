package Lesson_9.BASIC_LAB9.LR;

import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Car[] cars = new Car[7];
        cars[0] = new Car(0, "BMW", "320d", 2013, "Black", 40000, "ABCD");
        cars[1] = new Car(1, "BMW", "X5", 2011, "Blue", 60000, "ABCDEF");
        cars[2] = new Car(2, "Mercedes", "Gelentwagen", 2011, "Black", 80000, "ABCDNM");
        cars[3] = new Car(0, "BMW", "320d", 2013, "Black", 40000, "ABCD");
        cars[4] = new Car(0, "BMW", "320d", 2013, "Black", 40000, "ABCD");
        cars[5] = new Car(3, "Wolkswagen", "Passat", 2008, "Black", 30000, "ABKL");
        cars[6] = new Car(4, "Mazda", "CX-5", 2008, "Black", 40000, "AIOF");

        while (true) {
            System.out.println("\nМеню");
            System.out.println("Введите 1 для вывода списка марок автомобилей из массива cars");
            System.out.println("Введите 2 для вывода списка автомобилей, которым больше n лет");
            System.out.println("Введите 3 для вывода списка автомобилей заданного года выпуска, " +
                    "цена которых больше указанной");
            System.out.println("Введите 4 для вывода списка одинаковых автомобилей в сравнении с первым" +
                    "в массиве cars");
            System.out.println("Введите 0 для выхода из программы\n");

            String userIn = scanner.next();
            if (userIn.equals("0")) {
                break;
            } else {
                switch (userIn) {
                    case "1":
                        for (Car car : cars) {
                            System.out.println(car.getModel());
                        }
                        break;
                    case "2":
                        System.out.print("Введите n: ");
                        int n = scanner.nextInt();
                        for (Car car : cars) {
                            if (2021 - car.getYear() > n) {
                                System.out.println(car);
                            }
                        }
                        break;
                    case "3":
                        System.out.println("Введите год выпуска: ");
                        int year = scanner.nextInt();
                        System.out.println("Введите цену: ");
                        double price = scanner.nextDouble();
                        for (Car car : cars) {
                            if (car.getYear() == year && car.getPrice() > price) {
                                System.out.println(car);
                            }
                        }
                        break;
                    case "4":
                        int count = 0;
                        for (int i = 1; i < cars.length; i++) {
                            if (cars[i].equals(cars[0]) && cars[i].hashCode() == cars[0].hashCode()) {
                                count++;
                                System.out.println(cars[i]);
                            }
                        }
                        System.out.println("Количество одинаковых авто в сравнении с первым в массиве cars: " + count);
                        break;
                }
            }
        }
    }
}
