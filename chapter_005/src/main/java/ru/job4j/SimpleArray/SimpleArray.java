package ru.job4j.SimpleArray;

import java.util.ArrayList;

/**
 * Created by Comp on 22.09.2017.
 */
public class SimpleArray<T> {
    /*
     * Доделать контейнер SimpleArray<T> добавить методы add, update, delete, get(int index);
     */
    Object[] object = {10};
    int index = 0;
    ArrayList<T> objects;

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
}

