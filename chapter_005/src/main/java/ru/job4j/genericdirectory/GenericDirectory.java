package ru.job4j.genericdirectory;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * Created by Comp on 04.11.2017.
 */
public class GenericDirectory<K, V> implements SimpleMap<K, V> {
    private Entry[] entry;
    private int size = 0;
    private static final int ENTRY_SIZE = 100;

    public GenericDirectory() {
        this.entry = new Entry[ENTRY_SIZE];
    }

    public GenericDirectory(Entry[] entry) {
        this.entry = entry;
    }

    public Entry[] getEntry() {
        return entry;
    }

    public void setEntry(Entry[] entry) {
        this.entry = entry;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public static int getEntrySize() {
        return ENTRY_SIZE;
    }

    private int indexOf(K key) {
        return key.hashCode() % entry.length;
    }

    public int size() {
        return this.size;
    }

    /**
     * Insert new key-value pair at the storage.
     *
     * @param key   for adding. Notice that is must be unique, otherwise you may loose old value.
     * @param value for adding.
     * @return true if pair was added, otherwise false.
     */
    public boolean insert(K key, V value) {
        boolean isInsert;

        if (value == null) {
            isInsert = false;
        }
        int index = indexOf(key);

        if (!contains(key)) {
            entry[index] = new Entry<K, V>(key, value);
            isInsert = true;
        } else {
            isInsert = false;
        }
        size++;
        return isInsert;
    }

    /**
     * Return element from dictionary.
     *
     * @param key unique object for each value in the dictionary.
     * @return if is find at the dictionary return object from dictionary, otherwise false.
     */
    public V get(K key) {
        int index = indexOf(key);

        if (contains(key)) {
            return (V) entry[index].getValue();
        } else {
            return null;
        }
    }

    /**
     * Check that given key exist dictionary and delete element.
     *
     * @param key object for checking.
     * @return true if object delete at the set.
     */
    public boolean delete(K key) {
        boolean isDelete = false;
        int index = indexOf(key);

        if (contains(key)) {
            entry[index] = null;
            isDelete = true;
        }
        size--;
        return isDelete;
    }

    private boolean contains(K key) {
        return entry[indexOf(key)] != null;
    }

    @Override
    public Iterator iterator() {
        return new GenericIteratator();
    }

    private class GenericIteratator implements Iterator {
        private int counter = 0;

        @Override
        public boolean hasNext() {
            boolean isPresent = false;

            for (int i = counter; i < entry.length; i++) {
                if (entry[i] != null) {
                    counter = i;
                    isPresent = true;
                    break;
                }
            }
            return isPresent;
        }

        @Override
        public Object next() {
            if (hasNext()) {
                return entry[counter++];
            } else {
                throw new NoSuchElementException();
            }
        }
    }
}
