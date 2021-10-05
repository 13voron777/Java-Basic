package Lesson_2.BASIC_LAB2.EXTRA1;

public class Run {
    public static void main(String[] args) {
        Student student1 = new Student("Ivanov I. I.", "1 January 2000");
        Student student2 = new Student("Petrov S. S.", "29 February 2000", "7777777", 1);
        System.out.println(student1 + "\n" + student2);
    }

}
