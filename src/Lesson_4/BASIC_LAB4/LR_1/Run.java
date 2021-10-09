package Lesson_4.BASIC_LAB4.LR_1;

public class Run {
    public static void main(String[] args) {
        Employer employer1 = new Worker();
        Employer employer2 = new President();
        Employer employer3 = new Manager();

        employer1.print();
        employer2.print();
        employer3.print();
    }
}
