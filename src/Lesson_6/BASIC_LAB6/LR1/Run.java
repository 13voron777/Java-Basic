package Lesson_6.BASIC_LAB6.LR1;

public class Run {
    public static void main(String[] args) {
        User user1 = new User("admin", "0000");
        user1.createQuery();

        User user2 = new User("user1", "1111");
        User.Query query1 = user2.new Query();
        query1.printToLog();

        User.Query query2 = new User("user2", "2222").new Query();
        query2.printToLog();
    }
}
