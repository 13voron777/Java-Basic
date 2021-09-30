package Lesson_6.BASIC_HW6.Task2;

public class Vehicle {
    public void print() {
        System.out.println(this.getClass().getSimpleName());
    }

    public static class Wheel {
        public void print() {
            System.out.println(this.getClass().getSimpleName());
        }
    }

    public static class Door {
        public void print() {
            System.out.println(this.getClass().getSimpleName());
        }
    }
}
