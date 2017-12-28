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
     * Верно, теперь поправь метод remove. А в методе add надо инкремент key перенести в if блок,
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

        if (e != null && getKey() == key) {
            objects[indexOf(e)] = e;
            e = null;
            isRemove = true;
        }

        return isRemove;
    }
}
