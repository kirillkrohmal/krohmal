package ru.job4j.StoreGeneric;


/**
 * Created by Comp on 24.09.2017.
 */
public abstract class AbstractStore<T extends Base> implements Store<T> {
    Object[] baseT = new Object[100];
    int index = 0;

    @Override
    public T add(T model) {
        baseT[index++] = model;
        return (T) baseT[index - 1];
    }

    @Override
    public T update(T model) {

        baseT[index] = model;
        return (T) baseT[index];
    }

    @Override
    public boolean delete(String id) {
        T base = null;
        if (base.getId().equals(id)) {
            baseT[index] = null;
            return true;
        }
        return false;
    }
}
