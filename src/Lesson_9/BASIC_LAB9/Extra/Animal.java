package Lesson_9.BASIC_LAB9.Extra;

import java.util.Objects;

public class Animal {
    private String name;
    private int age;
    private boolean tail;

    public Animal(String name, int age, boolean tail) {
        this.name = name;
        this.age = age;
        this.tail = tail;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public boolean isTail() {
        return tail;
    }

    @Override
    public String toString() {
        return "Имя: " + this.getName() +
                ", возраст: " + this.getAge() +
                ", хвост: " + (this.isTail() ? "Да" : "Нет");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return age == animal.age && tail == animal.tail && Objects.equals(name, animal.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, tail);
    }
}
