package Lesson_3.BASIC_LAB3.LAB3;

public class Run {
    public static void main(String[] args) {
        Printer printer1 = new Printer();
        Printer printer2 = new PrinterBlue();
        Printer printer3 = new PrinterRed();

        printer1.print("White");
        printer2.print("Blue");
        printer3.print("Red");
    }
}
