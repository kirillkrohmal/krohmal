package ru.job4j.StoreGeneric;

import java.util.ArrayList;

public interface Store<T extends Base> {
    public T add(T model);

    public T update(T model);

    public boolean delete(String id);
}
