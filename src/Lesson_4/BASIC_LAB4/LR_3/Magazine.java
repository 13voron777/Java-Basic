package Lesson_4.BASIC_LAB4.LR_3;

public class Magazine implements Printable {
    static int counter;

    @Override
    public void print() {
        System.out.println("Журнал " + counter);
        counter++;
    }
}
