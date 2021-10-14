package Lesson_6.BASIC_LAB6.LR2;

public class Run {
    public static void main(String[] args) {
        User user1 = new User("admin", "0000");
        user1.createQuery();

        User user2 = new User("user1", "1111");
        user2.createQuery();

        User user3 = new User("user2", "2222");
        user3.createQuery();
    }
}
