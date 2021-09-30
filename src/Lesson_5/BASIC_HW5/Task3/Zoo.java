import java.util.ArrayList;

public class Zoo {
    public static void main(String[] args) {
        ArrayList<String> animals = new ArrayList<>();
        animals.add(0, "Dog");
        animals.add(0, "Cat");
        animals.add(1, "Pig");
        animals.add(1, "Dolphin");
        animals.add(2, "Horse");
        animals.add(1, "Duck");
        animals.add(3, "Chicken");
        animals.add(5, "Goose");
        System.out.print("Список животных: ");
        for (String animal : animals) {
            System.out.print(animal + " ");
        }
        System.out.println("\nРазмер списка: " + animals.size());
        animals.remove(7);
        animals.remove(5);
        animals.remove(3);
        System.out.print("Список животных после удаления животных 3, 5, 7: ");
        for (String animal : animals) {
            System.out.print(animal + " ");
        }
        System.out.println("\nРазмер списка после удаления животных 3, 5, 7: " + animals.size());
    }
}
