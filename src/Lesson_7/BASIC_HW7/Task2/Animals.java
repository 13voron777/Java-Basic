package Lesson_7.BASIC_HW7.Task2;

public enum Animals {
    DOG(15), CAT(10), CROCODILE(50);

    int age;

    Animals(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Animal = " + this.name() + "; age = " + age;
    }
}
