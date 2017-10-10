package ru.job4j.StoreGeneric;

import java.util.ArrayList;

public class RoleStore<T> extends AbstractStore {
    Base[] baseT = new Base[100];;
    int index = 0;

    @Override
    public Base add(Base model) {
        baseT[index++] = model;
        return baseT[index];
    }

    @Override
    public Base update(Base model) {
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
