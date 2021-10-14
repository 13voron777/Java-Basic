package Lesson_6.BASIC_LAB6.LR3;

public class User {
    private static String login;
    private static String password;

    public static void setLogin(String login) {
        User.login = login;
    }

    public static void setPassword(String password) {
        User.password = password;
    }

    public static void createQuery() {
        new Query().printToLog();
    }

    public static class Query {
        public void printToLog() {
            System.out.println("Пользователь с логином " + login + " и паролем " + password + " отправил запрос");
        }
    }
}
