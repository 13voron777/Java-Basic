import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String key = scanner.next();
        AbstractDocument abstractDocument;
        if (key.equals("777pro")) {
            abstractDocument = new ProDocumentWorker();
        } else if (key.equals("exp777")) {
            abstractDocument = new ExpertDocumentWorker();
        } else {
            abstractDocument = new DocumentWorker();
        }
        abstractDocument.openDocument();
        abstractDocument.editDocument();
        abstractDocument.saveDocument();
    }
}
