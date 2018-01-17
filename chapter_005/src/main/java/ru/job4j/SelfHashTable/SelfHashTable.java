package ru.job4j.SelfHashTable;

import java.util.Arrays;

/**
 * Created by Comp on 14.10.2017.
 */
public class SelfHashTable<E> {
    private Object[] objects = null;

    private int key;
    private int value;

    private int hash;

    private int size = 0;

    public SelfHashTable(Object[] objects) {
        objects = new Object[1000];
    }

    public SelfHashTable(int key, int value, int hash) {
        this.key = key;
        this.value = value;
        this.hash = hash;
    }

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getHash() {
        return hash;
    }

    public void setHash(int hash) {
        this.hash = hash;
    }

    public int size() {
        return size;
    }

    private int indexOf(E e) {
        return e.hashCode() % objects.length;
    }

    private int getKey(E e) {
        return key;
    }

    /*
     * операцию добавления новой пары
     * А в методе add надо инкремент key перенести в if блок,
     * иначе он инкрементируется в любом случае, вне зависимости добавлен элемент или нет.
     */
    public boolean add(E e) {
        if (e == null) {
            return false;
        }
        boolean added = false;

        if (contains(e)) {
            objects[indexOf(e)] = e;
            added = true;
            key++;
        }

        return added;
    }

    /*
     * операцию поиска
     */
    public boolean contains(E e) {
        return objects[indexOf(e)] == null;
    }

    /*
     * операцию удаления пары по ключу
     */
    public boolean remove(E e) {
        boolean isRemove = false;

        if (objects[indexOf(e)] != null) {
            objects[indexOf(e)] = null;
            isRemove = true;
        }

        return isRemove;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SelfHashTable<?> that = (SelfHashTable<?>) o;

        if (key != that.key) return false;
        if (size != that.size) return false;
        // Probably incorrect - comparing Object[] arrays with Arrays.equals
        return Arrays.equals(objects, that.objects);
    }

    private static int hash(Object key) {
        int h;
        return (key == null) ? 0 : (h = key.hashCode()) ^ (h >>> 16);
    }
}
