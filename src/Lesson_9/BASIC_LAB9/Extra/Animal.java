package Lesson_9.BASIC_LAB9.Extra;

public class Animal {
    private String name;
    private int age;
    private boolean tail;

    public Animal(String name, int age, boolean tail) {
        this.name = name;
        this.age = age;
        this.tail = tail;
    }

    @Override
    public String toString() {
        return "Имя: " + name +
                ", возраст: " + age +
                ", хвост: " + (tail ? "Да" : "Нет");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return age == animal.age && tail == animal.tail && name.equals(animal.name);
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 37 * result + (name == null ? 0 : name.hashCode());
        result = 37 * result + age;
        result = 37 * result + (tail ? 1 : 0);
        return result;
    }
}
