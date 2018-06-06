package ru.job4j.Iterator2;

import java.util.Iterator;

/**
 * Created by Comp on 25.09.2017.
 */
public class ArrIterator2 implements Iterator {
    private int count;
    private int[] value;

    public ArrIterator2(int[] value) {
        this.value = value;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int[] getValue() {
        return value;
    }

    public void setValue(int[] value) {
        this.value = value;
    }

    @Override
    public boolean hasNext() {
        return value.length > count;
    }

    @Override
    public Object next() {
        return value[count++];
    }
}
