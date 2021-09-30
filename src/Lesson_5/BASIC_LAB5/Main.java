package Lesson_5.BASIC_LAB5;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ArrayList teachers = new ArrayList<>(Arrays.asList("English", "Mathematics",
                "Fizra", "Physics", "Biology"));
        System.out.print("Список учителей: ");
        for (Object teacher : teachers) {
            System.out.print(teacher + " ");
        }
        System.out.println("\nЛучший учитель: " + teachers.get(1));
        System.out.println("Худший учитель: " + teachers.get(3));
    }
}
