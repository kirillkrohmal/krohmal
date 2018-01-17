package ru.job4j.GenericDirectory;


import java.util.Arrays;
import java.util.Iterator;

/**
 * Created by Comp on 04.11.2017.
 */

public class GenericDirectory<K, V> implements SimpleMap<K, V> {
    Entry[] entry;
    Entry store;
    private int size = 0;
    private static final int ENTRY_SIZE = 100;

    public GenericDirectory() {
        this.entry = new Entry[ENTRY_SIZE];
    }

    public GenericDirectory(int size) {
        this.entry = new Entry[size];
    }

    private int getHashCodeKey(K key) {
        int result = Arrays.hashCode(entry);
        result = 31 * result + size;
        return result;
    }

    public boolean isKey(K key) {
        boolean result = false;
        if (store.getKey() == key) {
            result = true;
        }

        return result;
    }

    /**
     * Insert new key-value pair at the storage.
     *
     * @param key   for adding. Notice that is must be unique, otherwise you may loose old value.
     * @param value for adding.
     * @return true if pair was added, otherwise false.
     */
    public boolean insert(K key, V value) {
        boolean isInsert = false;

        int index = getHashCodeKey(key);
        if ((getHashCodeKey(key) != 0 && entry != null)) {
            entry[index] = new Entry<K, V>(key, value);
            isInsert = true;
        }

        return isInsert;
    }

    /**
     * Return element from dictionary.
     *
     * @param key unique object for each value in the dictionary.
     * @return if is find at the dictionary return object from dictionary, otherwise false.
     */
    public V get(K key) {
        V value = null;

        for (Entry entry1 : entry) {
            if (entry1.getKey().equals(key)) {
                value = (V) entry1.getValue();
            }
        }
        return value;
    }

    /**
     * Check that given key exist dictionary.
     *
     * @param key object for checking.
     * @return true if object exist at the set.
     */
    public boolean delete(K key) {
        boolean isDelete = false;
		V value = null;

        int index = getHashCodeKey(key);
        for (Entry entry1 : entry) {
			if (entry1.getKey().equals(key)) {
				entry[index] = null;
				isDelete = true;
			}
        }

        return isDelete;
    }

    public boolean contains(K key) {
		for (Entry entry1 : entry) {
            if (entry1.getKey().equals(key)) {
				return true;	
			}
		}

        return false;
    }

    public int size() {
        return this.size;
    }

    @Override
    public Iterator iterator() {
        return new Iterat();
    }

    private class Iterat implements Iterator {
        @Override
        public boolean hasNext() {
            if (store.getValue() != null) {
				return true;
			}
			
			return false;
        }

        @Override
        public Object next() {
			if (hasNext()) {
                iterator().next();
			}
			return null;
        }
    }
}
