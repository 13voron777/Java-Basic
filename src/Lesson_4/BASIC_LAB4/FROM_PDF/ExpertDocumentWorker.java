package Lesson_4.BASIC_LAB4.FROM_PDF;

public class ExpertDocumentWorker extends ProDocumentWorker {
    @Override
    void saveDocument() {
        System.out.println("Документ сохранен в новом формате");
    }
}
