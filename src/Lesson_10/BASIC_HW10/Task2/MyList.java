package Lesson_10.BASIC_HW10.Task2;

public class MyList<T> {
    private int capacity;
    private int curPos;
    private Object[] arr;

    public MyList() {
        capacity = 10;
        curPos = -1;
        arr = new Object[capacity];
    }

    public void add(T t) {
        curPos++;
        if (curPos == arr.length) {
            capacity *= 1.5;
            Object[] temp = arr;
            arr = new Object[capacity];
            for (int i = 0; i < temp.length; i++) {
                arr[i] = temp[i];
            }
        }
        arr[curPos] = t;
    }

    public T get(int index) {
        return (T) arr[index];
    }

    public int size() {
        return curPos + 1;
    }

    @Override
    public String toString() {
        String res = "";
        for (int i = 0; i < curPos + 1; i++) {
            if (i == curPos) {
                res += arr[i];
            } else {
                res += arr[i] + " ";
            }
        }
        return "[" + res + "]";
    }
}
