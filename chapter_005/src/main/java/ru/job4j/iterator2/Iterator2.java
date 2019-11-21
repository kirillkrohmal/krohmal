package ru.job4j.iterator2;

import java.util.Iterator;

/**
 * Created by Comp on 25.09.2017.
 */
public class Iterator2 implements Iterator {
    private int count;
    private int[] value;

    public Iterator2(int[] value) {
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
