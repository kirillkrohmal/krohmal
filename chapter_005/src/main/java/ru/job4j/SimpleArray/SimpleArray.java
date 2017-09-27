package ru.job4j.SimpleArray;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Comp on 22.09.2017.
 */
public class SimpleArray<T, K> {
    /*
     * Доделать контейнер SimpleArray<T> добавить методы add, update, delete, get(int index);
     */
    Object[] object = {10};
    int index = 0;
    ArrayList<T> objects;
    //Map<K, T> mapper = new HashMap<>();

    public Object add(T value) {
        object[index++] = value;
        return object;
    }

    public Object update(T value) {
        object[index] = value;
        return object;
    }

    public Object delete(T value) {
        object[index] = null;
        return object;
    }

    public T get(int index) {
        return (T) object[index];
    }
}

