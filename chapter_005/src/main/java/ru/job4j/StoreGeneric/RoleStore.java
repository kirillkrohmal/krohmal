package ru.job4j.StoreGeneric;

import java.util.ArrayList;

public class RoleStore<T> extends AbstractStore {
    Base[] base = null;
    int index = 0;

    @Override
    public Base add(Base model) {
        base[index++] = (Base) model;
        return base[index];
    }

    @Override
    public Base update(Base model) {
        base[index] = (Base) model;
        return base[index];
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
