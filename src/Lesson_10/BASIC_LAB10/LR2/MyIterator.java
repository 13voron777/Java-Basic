package Lesson_10.BASIC_LAB10.LR2;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class MyIterator<T> implements Iterator<T> {
    private T[] t;

    public MyIterator(T[] t) {
        this.t = t;
    }

    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public T next() {
        if (this.hasNext()) {
            return null;
        }
        throw new NoSuchElementException();
    }
}
