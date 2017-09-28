package ru.job4j.StoreGeneric;

import java.util.ArrayList;

public class RoleStore<T> extends AbstractStore {
    Base[] base = new Base[]{};
    int index = 0;

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
