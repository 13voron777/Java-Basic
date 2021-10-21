package Lesson_8.BASIC_LAB8.LR1;

public class Run {
    public static void main(String[] args) {
        AnimalControlClass animal1 = new AnimalControlClass(true, true, true, true);
        AnimalControlClass animal2 = new AnimalControlClass(false, true, true, true);

        try {
            animal1.walk();
        } catch (AnimalException a) {
            System.out.println(a.getMessage());
        } finally {
            try {
                animal2.walk();
            } catch (AnimalException a) {
                System.out.println(a.getMessage());
            }
        }
    }
}
