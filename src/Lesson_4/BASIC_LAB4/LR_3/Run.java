package Lesson_4.BASIC_LAB4.LR_3;

public class Run {
    public static void main(String[] args) {
        Printable[] printables = new Printable[]{new Book(), new Magazine(), new Book(),
        new Book(), new Magazine()};

        for (Printable printable : printables) {
            printable.print();
        }
    }
}
