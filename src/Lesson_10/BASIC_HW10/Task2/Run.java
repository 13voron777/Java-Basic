package Lesson_10.BASIC_HW10.Task2;

public class Run {
    public static void main(String[] args) {
        MyList<String> myList = new MyList<>();
        myList.add("1");
        myList.add("2");
        myList.add("3");
        System.out.println("Список myList: " + myList);
        System.out.println("Размер списка: " + myList.size());
        System.out.println("Второй элемент: " + myList.get(1));
        System.out.println();

        MyList<Integer> myListInt = new MyList<>();
        for (int i = 0; i < 20; i++) {
            myListInt.add(i + 1);
        }
        System.out.println("Список myListInt: " + myListInt);
        System.out.println("Размер списка: " + myListInt.size());
        System.out.println("Третий элемент: " + myListInt.get(2));
        System.out.println("Десятый элемент: " + myListInt.get(9));
        System.out.println("Семнадцатый элемент: " + myListInt.get(16));
    }
}
