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
                    System.out.println("Значение года введено неверно!\n");
                }
            }
        }

        for (int i = 0; i < workers.length; i++) {
            for (int j = 0; j < i; j++) {
                if (workers[i].getFio().compareTo(workers[j].getFio()) < 0) {
                    Worker tempWorker = workers[i];
                    workers[i] = workers[j];
                    workers[j] = tempWorker;
                }
                if (workers[i].getFio().equals(workers[j].getFio())) {
                    if (workers[i].getWork().compareTo(workers[i - 1].getWork()) < 0) {
                        Worker tempWorker = workers[i];
                        workers[i] = workers[j];
                        workers[j] = tempWorker;
                    }
                }
            }
        }
        System.out.println();

        System.out.println("Весь список, отсортированный по алфавиту:");
        for (Worker worker : workers) {
            System.out.println(worker);
        }
        System.out.println();

        System.out.print("Введите стаж: ");
        int exp = scanner.nextInt();
        System.out.println("Список работников, стаж которых превышает " + exp + " лет:");
        for (Worker worker : workers) {
            if (2021 - worker.getStartYear() > exp) {
                System.out.println(worker);
            }
        }
    }
}
