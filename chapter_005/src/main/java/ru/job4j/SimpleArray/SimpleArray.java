package ru.job4j.SimpleArray;

/**
 * Created by Comp on 22.09.2017.
 */
public class SimpleArray<T> {
    private Object[] object = {10};
    private int index;

    public SimpleArray(Object[] object, int index) {
        this.object = object;
        this.index = index;
    }

    public SimpleArray() {
    }

    public T add(T value) {
        object[index++] = value;
        return (T) object[index - 1];
    }

    public T update(T value) {
        object[index] = value;
        return (T) object;
    }

    public T delete(T value) {
        if (value.equals(object)) {
            object[index] = null;
        }
        return (T) object;
    }

    public T get(int index) {
        return (T) object[index - 1];
    }

    public Object[] getObject() {
        return object;
    }

    public void setObject(Object[] object) {
        this.object = object;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }
}

