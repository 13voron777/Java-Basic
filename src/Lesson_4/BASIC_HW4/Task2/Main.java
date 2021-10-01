package Lesson_4.BASIC_HW4.Task2;

public class Main {
    public static void main(String[] args) {
        AbstractHandler[] abstractHandlers = new AbstractHandler[3];
        abstractHandlers[0] = new XMLHandler();
        abstractHandlers[1] = new TXTHandler();
        abstractHandlers[2] = new DOCHandler();

        for (AbstractHandler abstractHandler : abstractHandlers) {
            abstractHandler.open();
            abstractHandler.create();
            abstractHandler.change();
            abstractHandler.save();
            System.out.println();
        }
    }
}
