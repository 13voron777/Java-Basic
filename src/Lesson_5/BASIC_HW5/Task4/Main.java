import java.util.ArrayList;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<>();
        System.out.print("Список целых чисел: ");
        for (int i = 0; i < 10; i++) {
            integers.add((int) (Math.random() * 10));
            System.out.print(integers.get(i) + " ");
        }
        ListIterator<Integer> listIterator = integers.listIterator();
        System.out.print("\nСписок целых чисел после инкремента: ");
        while (listIterator.hasNext()) {
            int element = listIterator.next();
            listIterator.set(element + 1);
        }
        for (Integer integer : integers) {
            System.out.print(integer + " ");
        }
        System.out.println();
    }
}
