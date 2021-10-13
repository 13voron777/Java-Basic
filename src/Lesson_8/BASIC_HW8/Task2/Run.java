package Lesson_8.BASIC_HW8.Task2;

import java.util.*;

public class Run {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Worker[] workers = new Worker[5];

        for (int i = 0; i < workers.length; i++) {
            workers[i] = new Worker();
            workers[i].setFio(scanner.next());
            workers[i].setWork(scanner.next());
            int year;
            boolean bool = false;
            while (!bool) {
                try {
                    year = scanner.nextInt();
                    if (year < 2000 || year > 2021) {
                        throw new Exception();
                    }
                    workers[i].setStartYear(year);
                    bool = true;
                } catch (Exception e) {
                    System.out.println("Значение года введено неверно");
                }
            }
        }

        for (Worker worker : workers) {
            System.out.println(worker);
        }
    }
}
