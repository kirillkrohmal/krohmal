package ru.job4j.SelfHashTable;

import java.util.Arrays;

/**
 * Created by Comp on 14.10.2017.
 */
public class SelfHashTable<E> {
    private Object[] objects = null;
    private int key;
    private int size = 0;

    public SelfHashTable(Object[] objects) {
        objects = new Object[1000];
    }

  /*  public SelfHashTable(int size) {
        this.objects = new BasicElement[size];
    }*/

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

        int i = e.hashCode();
        BasicElement element = (BasicElement) objects[i];

        if (e != null && e.equals(element.getKey())) {
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
