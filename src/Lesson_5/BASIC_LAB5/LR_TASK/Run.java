package Lesson_5.BASIC_LAB5.LR_TASK;

import java.util.ArrayList;
import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        boolean bool = false;

        while (true) {
            int elem = scanner.nextInt();
            if (elem == -1) {
                break;
            }
            list.add(elem);
        }


        while (!bool) {
            System.out.print("Введите число от 1 до 5 (-1 для выхода): ");
            switch (scanner.nextInt()) {
                case 1:
                    list.add(scanner.nextInt());
                    break;
                case 2:
                    boolean bool2 = false;
                    while (!bool2) {
                        System.out.print("Введите 0 для удаления по индексу и " +
                                "1 для удаления по объекту: ");
                        int choose = scanner.nextInt();
                        switch (choose) {
                            case 0:
                                list.remove(scanner.nextInt());
                                bool2 = true;
                                break;
                            case 1:
                                list.remove((Integer) scanner.nextInt());
                                bool2 = true;
                                break;
                            default:
                                System.out.println("Можно ввести только 0 или 1");
                        }
                    }
                    break;
                case 3:
                    for (Integer num : list) {
                        System.out.print(num + " ");
                    }
                    System.out.println();
                    break;
                case 4:
                    if (list.contains(scanner.nextInt())) {
                        System.out.println("Значение есть");
                    } else {
                        System.out.println("Значение отсутствует");
                    }
                    break;
                case 5:
                    boolean bool5 = false;
                    while (!bool5) {
                        System.out.print("Введите индекс элемента для замены: ");
                        int index = scanner.nextInt();
                        if (index >= 0 && index <= list.size() - 1) {
                            list.set(index, scanner.nextInt());
                            bool5 = true;
                        } else {
                            System.out.println("Вы вышли за рамки списка, введите число еще раз!");
                        }
                    }
                    break;
                case -1:
                    bool = true;
                    break;
                default:
                    System.out.println("Можно ввести только число от 1 до 5");
            }
        }

    }
}
