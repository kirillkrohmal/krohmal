package ru.job4j.Practice.Example_2;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/**
 * Created by Comp on 18.11.2017.
 */
public class Clients_ID implements Map<String, Map> {
    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean containsKey(Object key) {
        return false;
    }

    @Override
    public boolean containsValue(Object value) {
        return false;
    }

    @Override
    public Map get(Object key) {
        return null;
    }

    @Override
    public Map put(String key, Map value) {
        return null;
    }

    @Override
    public Map remove(Object key) {
        return null;
    }

    @Override
    public void putAll(Map<? extends String, ? extends Map> m) {

    }

    @Override
    public void clear() {

    }

    @Override
    public Set<String> keySet() {
        return null;
    }

    @Override
    public Collection<Map> values() {
        return null;
    }

    @Override
    public Set<Entry<String, Map>> entrySet() {
        return null;
    }
}
