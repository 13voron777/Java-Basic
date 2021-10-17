package Lesson_10.BASIC_LAB10.Extra;

public class MyClass<T> {
    public static <T> void factoryMethod(T t) {
        T t1 = t;
        System.out.println("Класс переменной t: " + t.getClass().getSimpleName());
        System.out.println("Класс переменной t1: " + t1.getClass().getSimpleName());
        System.out.println();
    }
}
