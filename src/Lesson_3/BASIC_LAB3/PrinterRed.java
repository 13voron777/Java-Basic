package Lesson_3.BASIC_LAB3;

public class PrinterRed extends Printer {
    @Override
    public void print(String value) {
        System.out.println((char)27 + "[31m" + value);
    }
}
