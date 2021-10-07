package Lesson_3.BASIC_LAB3.EXTRA1;

public class Parrot extends Pet {
    public Parrot(String name, String type) {
        super(name, type);
    }

    @Override
    public void sound() {
        System.out.println("Durak!");
    }
}
