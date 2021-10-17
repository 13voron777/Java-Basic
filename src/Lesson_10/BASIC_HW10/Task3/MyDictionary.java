package Lesson_10.BASIC_HW10.Task3;

public class MyDictionary<TKey, TValue> {
    private int capacity;
    private int curPos;
    private Object[] arrKeys;
    private Object[] arrValues;

    public MyDictionary() {
        capacity = 10;
        curPos = -1;
        arrKeys = new Object[capacity];
        arrValues = new Object[capacity];
    }

    public void put(TKey tKey, TValue tValue) {
        curPos++;
        if (curPos == arrKeys.length) {
            capacity *= 1.5;
            Object[] tempKeys = arrKeys;
            Object[] tempValues = arrValues;
            arrKeys = new Object[capacity];
            arrValues = new Object[capacity];
            for (int i = 0; i < tempKeys.length; i++) {
                arrKeys[i] = tempKeys[i];
                arrValues[i] = tempValues[i];
            }
        }
        arrKeys[curPos] = tKey;
        arrValues[curPos] = tValue;
    }

    public TValue get(TKey key) {
        for (int i = 0; i < arrKeys.length; i++) {
            if (key.equals(arrKeys[i])) {
                return (TValue) arrValues[i];
            }
        }
        return null;
    }

    public int size() {
        return curPos + 1;
    }

    @Override
    public String toString() {
        String res = "";
        for (int i = 0; i < curPos + 1; i++) {
            if (i == curPos) {
                res += arrKeys[i] + "=" + arrValues[i];
            } else {
                res += arrKeys[i] + "=" + arrValues[i] + ", ";
            }
        }
        return "{" + res + "}";
    }
}
