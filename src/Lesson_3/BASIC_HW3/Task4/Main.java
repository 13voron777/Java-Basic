package Lesson_3.BASIC_HW3.Task4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String key = scanner.next();
        DocumentWorker documentWorker;
        if (key.equals("777pro")) {
            documentWorker = new ProDocumentWorker();
        } else if (key.equals("exp777")) {
            documentWorker = new ExpertDocumentWorker();
        } else {
            documentWorker = new DocumentWorker();
        }
        documentWorker.openDocument();
        documentWorker.editDocument();
        documentWorker.saveDocument();
    }
}
