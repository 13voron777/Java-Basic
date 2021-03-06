package Lesson_5.BASIC_HW5.Task4;

import java.util.ArrayList;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<>();
        System.out.print("Список целых чисел: ");
        for (int i = 0; i < 10; i++) {
            integers.add((int) (Math.random() * 10));
            System.out.print(integers.get(i) + " ");
        }
        ListIterator<Integer> listIterator = integers.listIterator();
        while (listIterator.hasNext()) {
            int element = listIterator.next();
            listIterator.set(element + 1);
        }
        System.out.println("\nСписок целых чисел после инкремента: " + integers);
    }
}
