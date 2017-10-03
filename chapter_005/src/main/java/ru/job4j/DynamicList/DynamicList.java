package ru.job4j.DynamicList;

import java.util.Iterator;
/**
 * Created by Comp on 03.10.2017.
 */
public class DynamicList<E> implements Iterable<E> {
    Object[] storage = {1000};
    Object[] container = storage;
    int size = 0;

    /*
     * код не верный:
     * 1) где инициализация поля container?
     * 2) почему в методе add нет проверки выхода за границы массива и обработки этой ситуации?
     * 3) в методе get не проверяется индекс
     * 4) реализация итератора не верна, почему вы массив приводит к типу Iterator?
     */
    public void add(E value) {
        try {
            if (container.length != size - 1) {
                container[size++] = value;
            }
        } catch (ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
        }
    }

    public E get(int index) {
        if (container[size].equals(index)) {
            return (E) container[index];
        }
        return (E) container[index];
    }

    @Override
    public Iterator iterator() {
        return (Iterator) new DynamicList();
    }
}
