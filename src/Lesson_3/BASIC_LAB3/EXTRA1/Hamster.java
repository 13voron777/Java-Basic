package Lesson_3.BASIC_LAB3.EXTRA1;

public class Hamster extends Pet {
    public Hamster(String name, String type) {
        super(name, type);
    }

    @Override
    public void sound() {
        System.out.println("Hrum!");
    }
}
