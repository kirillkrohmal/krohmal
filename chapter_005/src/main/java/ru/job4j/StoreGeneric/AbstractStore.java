package ru.job4j.StoreGeneric;

import java.util.ArrayList;

/**
 * Created by Comp on 24.09.2017.
 */
public abstract class AbstractStore<T extends Base> implements Store<T> {

    T[] baseT = (T[]) new Object[100];
    int index = 0;

    @Override
    public T add(T model) {
        baseT[index++] = model;
        return baseT[index];
    }

    @Override
    public T update(T model) {
        baseT[index] = model;
        return baseT[index];
    }

    @Override
    public boolean delete(String id) {
        Base base = null;
        if (base.getId().equals(id)) {
            baseT[index] = null;
            return true;
        }

        return false;
    }
}
