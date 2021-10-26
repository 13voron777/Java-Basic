package Lesson_10.BASIC_LAB10.LR1;

public class GenericClass<T> {
    public static <T> void show(T t) {
        System.out.println(t.getClass().getName());
    }
}
