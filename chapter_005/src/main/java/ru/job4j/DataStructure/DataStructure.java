package ru.job4j.DataStructure;

import java.util.HashMap;
import java.util.Map;



/**
 * Created by Comp on 19.11.2017.
 */
public class DataStructure<K, V> {

    private HashMap hashMap = new HashMap<>();
    int size = 0;

    boolean insert(K key, V value) {
        hashMap.put(key, value);
        return false;
    }

    public V get(K key) {
        for (int i = 0; i < hashMap.size(); i++) {
            if (hashMap.get(i).equals(key)) {
                hashMap.get();
            }
        }

        return null;
    }

    boolean delete(K key) {
        for (int i = 0; i < hashMap.size(); i++) {
            if (hashMap.get(i).equals(key)) {
                hashMap.remove(i);
            }
        }
        return false;
    }
}
