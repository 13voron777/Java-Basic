package Lesson_1.BASIC_HW1.Task3;

public class Title {
    private String title;

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void show() {
        System.out.println("Title: " + this.getTitle());
    }
}
