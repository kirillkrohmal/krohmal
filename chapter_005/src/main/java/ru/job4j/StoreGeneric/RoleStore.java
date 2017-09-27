package ru.job4j.StoreGeneric;

import java.util.ArrayList;

public class RoleStore <T> implements Store{
    Base[] base = new Base[]{};
    int index = 0;
    ArrayList<T> objects;

    public T add(T model) {
        base[index++] = (Base) model;
        return (T) base;
    }

    public T update(T model) {
        base[index] = (Base) model;
        return (T) base;
    }

    @Override
    public Base add(Base model) {
        base[index++] = (Base) model;
        //return base;
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
