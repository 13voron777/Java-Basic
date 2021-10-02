package Lesson_1.BASIC_HW1.Task3;

public class Author {
    private String author;

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void show() {
        System.out.println("Author: " + getAuthor());
    }
}
