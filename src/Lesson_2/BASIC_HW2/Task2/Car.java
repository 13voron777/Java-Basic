package Lesson_2.BASIC_HW2.Task2;

public class Car {
    private String color;
    private int age;

    public Car() {
    }

    public Car(String color) {
        this.color = color;
    }

    public Car(String color, int age) {
        this.color = color;
        this.age = age;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public int getAge() {
        return age;
    }
}
