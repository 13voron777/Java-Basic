package Lesson_1.BASIC_HW1.Task4;

public class Run {
    public static void main(String[] args) {
        Computer[] computers = new Computer[5];
        for (int i = 0; i < computers.length; i++) {
            computers[i] = new Computer();
            computers[i].setName("#: " + i);
        }

        System.out.println("Computers:");
        for (Computer computer : computers) {
            System.out.println(computer.getName());
        }
    }
}
