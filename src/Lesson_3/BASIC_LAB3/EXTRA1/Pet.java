package Lesson_3.BASIC_LAB3.EXTRA1;

public class Pet {
    private String name;
    private String type;

    public Pet(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public void sound() {
        System.out.println("Hey!");
    }

    public void show() {
        System.out.println(this.getName());
    }

    public void type() {
        System.out.println(this.getType());
    }
}
