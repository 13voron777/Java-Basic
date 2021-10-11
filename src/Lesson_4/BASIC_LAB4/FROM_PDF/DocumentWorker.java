package Lesson_4.BASIC_LAB4.FROM_PDF;

public class DocumentWorker extends AbstractDocument {
    @Override
    void editDocument() {
        System.out.println("Редактирование документа доступно в версии Про");
    }

    @Override
    void saveDocument() {
        System.out.println("Сохранение документа доступно в версии Про");
    }
}
