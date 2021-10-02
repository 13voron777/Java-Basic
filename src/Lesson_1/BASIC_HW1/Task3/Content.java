package Lesson_1.BASIC_HW1.Task3;

public class Content {
    private String content;

    public void setContent(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public void show() {
        System.out.println("Content: " + this.getContent());
    }
}
