package ru.job4j.StoreGeneric;

import java.util.ArrayList;

public interface Store<T extends Base> {
    T add(T model);

    T update(T model);

    boolean delete(String id);
}
