package Lesson_1.BASIC_HW1.Task3;

public class Book {
    public static void main(String[] args) {
        Author author = new Author();
        author.setAuthor("Defo");
        Title title = new Title();
        title.setTitle("Cruzo");
        Content content = new Content();
        content.setContent("Friday");

        author.show();
        title.show();
        content.show();
    }
}
