package ru.job4j.GenericDirectory;

/**
 * Created by Comp on 21.11.2017.
 */
public interface SimpleMap<K, V> extends Iterable {
    boolean insert(K key, V value);

    V get(K key);

    boolean delete(K key);
}

