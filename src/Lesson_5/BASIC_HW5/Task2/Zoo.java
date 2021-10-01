package Lesson_5.BASIC_HW5.Task2;

import java.util.ArrayList;

public class Zoo {
    public static void main(String[] args) {
        ArrayList<String> animals = new ArrayList<>();
        animals.add(0, "Dog");
        animals.add(0, "Cat");
        animals.add(1, "Pig");
        animals.add(1, "Dolphin");
        animals.add(2, "Horse");
        animals.add(1, "Duck");
        animals.add(3, "Chicken");
        animals.add(5, "Goose");
        System.out.println("Список животных:");
        for (String animal : animals) {
            System.out.print(animal + " ");
        }
        System.out.println();
    }
}
