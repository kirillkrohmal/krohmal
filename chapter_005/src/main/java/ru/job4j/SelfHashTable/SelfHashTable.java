package ru.job4j.SelfHashTable;

/**
 * Created by Comp on 14.10.2017.
 */
public class SelfHashTable<E> {
    Object[] objects = null;
    int key;
    Object value;

    int size = 0;

    public SelfHashTable(Object[] objects) {
        this.objects = new Object[1000];
    }

    public int size() {
        return size;
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

    public void setValue(Object value) {
        this.value = value;
    }

    public int indexOf(E e) {
        return e.hashCode() % objects.length;
    }

    /*
     * операцию добавления новой пары
     */
    public boolean add(E e) {
        if (e == null) {
            return false;
        }
        boolean added = false;
        key++;
        if (contains(e)) {
            objects[indexOf(e)] = e;
            added = true;
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

        for (int i = 0; i < indexOf(e); i++) {
            if (e != null && objects[getKey()] == e) {
                e = null;
                isRemove = true;
            }
        }

        return isRemove;
    }
}
