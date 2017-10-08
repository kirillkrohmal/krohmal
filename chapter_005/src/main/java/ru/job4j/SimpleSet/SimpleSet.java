package ru.job4j.SimpleSet;

import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * Created by Comp on 24.09.2017.
 */
public class SimpleSet<E> implements Iterator<E> {
    Object[] value;
    int size = 0;

    public SimpleSet() {
        this.value = new Object[1000];
    }

    /**
     * в коде есть ошибки:
     * 1) необходимо инициализировать поле value
     * 2) в методе add поле size не инкрементируется, в итоге элемент всегда будет вставляться по индексу 0 +
     * нужна проверка выхода за границы массива
     * 3) также метод add должен проверять нет ли таких элементов, потому что set не допускает дубликатов
     * 4) методы hasNext должен проверять есть ли элементы в сетке
     * 5) метод next должен возвращать следующий элемент, либо кидать NoSuchElementException
     * тебе надо проверить. что в массиве нет такого элемента.
     */
    public void add(E e) {
        boolean isPresent = false;
        {
            for (int i = 0; i < size; i++) {
                if (value[i].equals(e)) {
                    isPresent = true;
                }
            }
            if (!isPresent) {
                if (size < value.length) {
                    value[size++] = e;
                }
            }
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SimpleSet<?> simpleSet = (SimpleSet<?>) o;

        if (size != simpleSet.size) return false;
        // Probably incorrect - comparing Object[] arrays with Arrays.equals
        return Arrays.equals(value, simpleSet.value);
    }

    @Override
    public int hashCode() {
        int result = Arrays.hashCode(value);
        result = 31 * result + size;
        return result;
    }
}
