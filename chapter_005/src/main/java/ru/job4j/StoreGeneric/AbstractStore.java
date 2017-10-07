package ru.job4j.StoreGeneric;

import java.util.ArrayList;

/**
 * Created by Comp on 24.09.2017.
 */
public class AbstractStore<T> implements Store {

    T[] base = (T[]) new Object[100];
    int index = 0;

    @Override
    public Base add(Base model) {
        base[index++] = (T) model;
        return (Base) base[index];
    }

    @Override
    public Base update(Base model) {
        base[index] = (T) model;
        return (Base) base[index];
    }

    @Override
    public boolean delete(String id) {
        if (base.equals(id)) {
            base[index] = null;
            return true;
        }

        return false;
    }
}
