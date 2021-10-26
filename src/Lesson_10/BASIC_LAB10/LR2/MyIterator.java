package Lesson_10.BASIC_LAB10.LR2;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class MyIterator<T> implements Iterator<T> {
    private T[] t;
    int currentIndex;
    T currentElem;

    public MyIterator(T[] t) {
        this.t = t;
    }

    @Override
    public boolean hasNext() {
        return currentIndex < t.length;
    }

    @Override
    public T next() {
        if (this.hasNext()) {
            currentElem = t[currentIndex++];
            return currentElem;
        }
        throw new NoSuchElementException();
    }
}
