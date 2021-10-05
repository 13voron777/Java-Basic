package Lesson_2.BASIC_HW2.Task3;

public class Car {
    private String color;
    private int age;
    private int weight;
    private double speed;

    public Car() {
    }

    public Car(String color) {
        this.color = color;
    }

    public Car(double speed) {
        this.speed = speed;
    }

    public Car(String color, int age) {
        this.color = color;
        this.age = age;
    }

    public Car(int weight, double speed) {
        this.weight = weight;
        this.speed = speed;
    }

    public Car(String color, int age, int weight) {
        this.color = color;
        this.age = age;
        this.weight = weight;
    }

    public Car(String color, int age, double speed) {
        this.color = color;
        this.age = age;
        this.speed = speed;
    }

    public Car(String color, int age, int weight, double speed) {
        this.color = color;
        this.age = age;
        this.weight = weight;
        this.speed = speed;
    }

    public Car(String color, double speed, int age, int weight) {
        this.color = color;
        this.speed = speed;
        this.age = age;
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public int getAge() {
        return age;
    }

    public int getWeight() {
        return weight;
    }

    public double getSpeed() {
        return speed;
    }
}
