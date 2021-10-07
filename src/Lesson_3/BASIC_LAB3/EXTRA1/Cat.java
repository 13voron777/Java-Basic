package Lesson_3.BASIC_LAB3.EXTRA1;

public class Cat extends Pet {
    public Cat(String name, String type) {
        super(name, type);
    }

    @Override
    public void sound() {
        System.out.println("Meow!");
    }
}
