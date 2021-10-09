package Lesson_4.BASIC_LAB4.FROM_PDF;

public abstract class AbstractDocument {
    void openDocument() {
        System.out.println("Документ открыт");
    }

    abstract void editDocument();
    abstract void saveDocument();
}
