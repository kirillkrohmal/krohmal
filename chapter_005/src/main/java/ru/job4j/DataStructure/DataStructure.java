package ru.job4j.DataStructure;

import java.util.HashMap;
import java.util.Map;



/**
 * Created by Comp on 19.11.2017.
 */
public class DataStructure<K, V> {

    private HashMap hashMap = new HashMap<>();
    int size = 0;

    public boolean insert(K key, V value) {
        hashMap.put(key, value);
        return false;
    }

    public V get(K key) {
        for (int i = 0; i < hashMap.size(); i++) {
            if (hashMap.get(i).equals(key)) {
                hashMap.get(hashMap.values());
            }
        }

        return null;
    }

    public boolean delete(K key) {
        for (int i = 0; i < hashMap.size(); i++) {
            if (hashMap.get(i).equals(key)) {
                hashMap.remove(i);
            }
        }
        return false;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DataStructure<?, ?> that = (DataStructure<?, ?>) o;

        if (size != that.size) return false;
        return hashMap != null ? hashMap.equals(that.hashMap) : that.hashMap == null;
    }

    @Override
    public int hashCode() {
        int result = hashMap != null ? hashMap.hashCode() : 0;
        result = 31 * result + size;
        return result;
    }
}
