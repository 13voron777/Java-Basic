package Lesson_2.BASIC_HW2.Task4;

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
        this(color);
        this.age = age;
    }

    public Car(int weight, double speed) {
        this(speed);
        this.weight = weight;
    }

    public Car(String color, int age, int weight) {
        this(color, age);
        this.weight = weight;
    }

    public Car(String color, int age, double speed) {
        this(color, age);
        this.speed = speed;
    }

    public Car(String color, int age, int weight, double speed) {
        this(color, age, speed);
        this.weight = weight;
    }

    public Car(String color, double speed, int age, int weight) {
        this(color, age, weight);
        this.speed = speed;
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