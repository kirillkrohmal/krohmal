package ru.job4j.SimpleSet;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * Created by Comp on 24.09.2017.
 */
public class SimpleSet<E> implements Iterator<E> {
    Object[] value = null;
    int size;

    /**
     * в коде есть ошибки:
     * 1) необходимо инициализировать поле value
     * 2) в методе add поле size не инкрементируется, в итоге элемент всегда будет вставляться по индексу 0 +
     * нужна проверка выхода за границы массива
     * 3) также метод add должен проверять нет ли таких элементов, потому что set не допускает дубликатов
     * 4) методы hasNext должен проверять есть ли элементы в сетке
     * 5) метод next должен возвращать следующий элемент, либо кидать NoSuchElementException
     */
    public void add(E e) {
        try {
            if (value != e) {
                value[size++] = e;
            }
        } catch (ArrayIndexOutOfBoundsException u){
            u.printStackTrace();
        }
    }

    @Override
    public boolean hasNext() {
        return value.length > size;
    }

    @Override
    public E next() {
        try {
            return (E) value[size++];
        } catch (NoSuchElementException e) {
            e.printStackTrace();
        }
        return (E) value;
    }
}
