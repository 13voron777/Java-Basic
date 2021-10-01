package Lesson_1.BASIC_HW1.Task3;

public class Book {
    public static void main(String[] args) {
        Author author = new Author();
        author.author = "Defo";
        Title title = new Title();
        title.title = "Cruzo";
        Content content = new Content();
        content.content = "Friday";
        System.out.println("Author: " + author.author);
        System.out.println("Title: " + title.title);
        System.out.println("Content: " + content.content);
    }
}
