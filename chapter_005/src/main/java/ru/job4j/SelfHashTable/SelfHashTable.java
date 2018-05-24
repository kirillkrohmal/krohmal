package ru.job4j.SelfHashTable;

import java.util.Arrays;

/**
 * Created by Comp on 14.10.2017.
 */
public class SelfHashTable<E> {
    private Object[] objects = null;
    private int key;
    private int value;

    public SelfHashTable() {
        objects = new Object[1000];
    }

    public SelfHashTable(int key, int value, int hash) {
        this.key = key;
        this.value = value;
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

    private int indexOf(E e) {
        return e.hashCode() % objects.length;
    }

    /*
     * операция добавления новой пары
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
     * операция поиска
     */
    public boolean contains(E e) {
        return objects[indexOf(e)] == null;
    }

    /*
     * операция удаления пары по ключу
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
         // Probably incorrect - comparing Object[] arrays with Arrays.equals
        return Arrays.equals(objects, that.objects);
    }

    @Override
    public int hashCode() {
        int result = Arrays.hashCode(objects);
        result = 31 * result + key;
        result = 31 * result + value;
        return result;
    }
}
