package Lesson_3.BASIC_LAB3.EXTRA2;

public class Run {
    public static void main(String[] args) {
        Passport passport = new Passport("Ivan", "Ivanov", "Ivanovich", "01.01.2001", 77, 7777777);
        String[] visas = new String[]{"Spain", "Poland", "USA", "GB", "Australia"};
        ForeignPassport foreignPassport = new ForeignPassport("Ivan", "Ivanov", "Ivanovich",
                "01.01.2001", 77, 7777777, visas);
        System.out.println(passport + "\n" + foreignPassport);
    }
}
