package ru.job4j.GenericDirectory;


import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * Created by Comp on 04.11.2017.
 */

public class GenericDirectory<K, V> implements SimpleMap<K, V> {
    Entry[] entry;
    Entry store;
    private int size = 0;
    private int counter = 0;
    private static final int ENTRY_SIZE = 100;


    public GenericDirectory() {
        this.entry = new Entry[ENTRY_SIZE];
    }

    public GenericDirectory(int size) {
        this.entry = new Entry[size];
    }

    private int indexOf(V value) {
        return value.hashCode() % entry.length;
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

        if (value == null) {
            isInsert = false;
        }

        int index = indexOf(value);
        if (entry[index] == null) {
            entry[index] = new Entry<K, V>(key, value);
            isInsert = true;
        } else {
            isInsert = false;
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
            if (isKey(key)) {
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

        if (value == null) {
            isDelete = false;
        }

        int index = indexOf(value);

        if (isKey(key)) {
            entry[index] = null;
            isDelete = true;
        }

        return isDelete;
    }

    public boolean contains(V value) {
        return entry[indexOf(value)] == null;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        GenericDirectory<?, ?> directory = (GenericDirectory<?, ?>) o;

        if (size != directory.size) return false;
        // Probably incorrect - comparing Object[] arrays with Arrays.equals
        if (!Arrays.equals(entry, directory.entry)) return false;
        return store != null ? store.equals(directory.store) : directory.store == null;
    }

    @Override
    public int hashCode() {
        int result = Arrays.hashCode(entry);
        result = 31 * result + (store != null ? store.hashCode() : 0);
        result = 31 * result + size;
        return result;
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
            boolean isPresent;
            return isPresent = size() != counter;
        }

        @Override
        public Object next() {
			if (hasNext()) {
                return entry[counter++];
			} else throw  new NoSuchElementException();
        }
    }
}
