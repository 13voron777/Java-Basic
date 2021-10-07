package Lesson_3.BASIC_LAB3;

public class PrinterBlue extends Printer{
    @Override
    public void print(String value) {
        System.out.println((char)27 + "[34m" + value);
    }
}
