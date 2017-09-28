package ru.job4j.StoreGeneric;

import java.util.ArrayList;

/**
 * Created by Comp on 24.09.2017.
 */
public class AbstractStore implements Store {
    Base[] base = new Base[]{};
    private int index = 0;
    //ArrayList<T> objects;

    @Override
    public Base add(Base model) {
        base[index++] = (Base) model;
        return model;
    }

    @Override
    public Base update(Base model) {
        base[index] = (Base) model;
        return model;
    }

    @Override
    public boolean delete(String id) {
        base[index] = null;
        return false;
    }
}
