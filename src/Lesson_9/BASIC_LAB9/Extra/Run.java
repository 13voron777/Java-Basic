package Lesson_9.BASIC_LAB9.Extra;

public class Run {
    public static void main(String[] args) {
        Animal animal1 = new Animal("Васька", 45, false);
        Animal animal2 = new Animal("Васька", 45, false);
        Animal animal3 = animal1;

        System.out.println(animal1);
        System.out.println(animal2);
        System.out.println(animal3);
        System.out.println();

        System.out.println(animal1.hashCode());
        System.out.println(animal2.hashCode());
        System.out.println(animal3.hashCode());
        System.out.println();

        System.out.println(animal1.equals(animal2));
        System.out.println(animal1.equals(animal3));
        System.out.println(animal2.equals(animal3));
        System.out.println();

        System.out.println(animal1 == animal2);
        System.out.println(animal1 == animal3);
        System.out.println(animal2 == animal3);
    }
}
