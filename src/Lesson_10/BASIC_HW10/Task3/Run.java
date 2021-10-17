package Lesson_10.BASIC_HW10.Task3;

public class Run {
    public static void main(String[] args) {
        MyDictionary<String, String> myDictionary = new MyDictionary<>();
        myDictionary.put("1", "Ivanov");
        myDictionary.put("2", "Petrov");
        myDictionary.put("3", "Sidorov");
        System.out.println("Словарь myDictionary: " + myDictionary);
        System.out.println("Размер списка: " + myDictionary.size());
        System.out.println("Второй элемент: " + myDictionary.get("2"));
        System.out.println();

        MyDictionary<Integer, String> myDictionaryInt = new MyDictionary<>();
        for (int i = 0; i < 20; i++) {
            myDictionaryInt.put(i + 1, (i + 1) + "-й");
        }
        System.out.println("Список myDictionaryInt: " + myDictionaryInt);
        System.out.println("Размер списка: " + myDictionaryInt.size());
        System.out.println("Третий элемент: " + myDictionaryInt.get(3));
        System.out.println("Десятый элемент: " + myDictionaryInt.get(10));
        System.out.println("Семнадцатый элемент: " + myDictionaryInt.get(17));
    }
}
