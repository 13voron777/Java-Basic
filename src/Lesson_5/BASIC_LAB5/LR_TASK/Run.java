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
            switch (scanner.nextInt()) {
                case 1:
                    list.add(scanner.nextInt());
                    break;
                case 2:
                    list.remove(list.size() - 1);
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
                    list.set(scanner.nextInt(), scanner.nextInt());
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
