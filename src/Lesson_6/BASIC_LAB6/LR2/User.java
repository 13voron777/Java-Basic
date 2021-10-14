package Lesson_6.BASIC_LAB6.LR2;

public class User {
    private String login;
    private String password;

    public User(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public void createQuery() {
        class Query {
            public void printToLog() {
                System.out.println("Пользователь с логином " + login + " и паролем " + password + " отправил запрос");
            }
        }
        Query query = new Query();
        query.printToLog();
    }


}
