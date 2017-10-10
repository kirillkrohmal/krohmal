package ru.job4j.DynamicList;

import java.util.Arrays;
import java.util.Iterator;

/**
 * Created by Comp on 03.10.2017.
 */
public class DynamicList<E> implements Iterable {
    E[] container = (E[]) new Object[1000];
    int size = 0;
    int count = 0;

    /*
     * код не верный:
     * 1) где инициализация поля container?
     * 2) почему в методе add нет проверки выхода за границы массива и обработки этой ситуации?
     * 3) в методе get не проверяется индекс
     * 4) реализация итератора не верна, почему вы массив приводит к типу Iterator?
     * тебе надо если размер закончился, то надо пересоздать массив с большой длинной.
     */
    public void add(E value) {
        if (container.length > size) {
            container[size++] = value;
        } else if (container.length == size) {
            //копировать элементы из первого массива и использовать эти элементы в новом массиве;
            Arrays.copyOf(container, (Integer) container[size++]);
        }
    }

    public E get(int index) {
        E s = (E) new Object();
        for (int i = 0; i < container.length; i++) {
            if (container[i].equals(index)) {
                s = container[size];
            }
        }
        return s;
    }

        class ArrayIterator implements Iterator<E> {
            @Override
            public boolean hasNext() {
                boolean isPresent = false;
                for (int i = 0; i < count; i++) {
                    count++;
                    if (i < size) {
                        isPresent = true;
                    } else if (i > size) {
                        isPresent = false;
                    }
                }
                return isPresent;
            }

            @Override
            public E next() {
                Object index = null;
                if (hasNext() == true) {
                    index = container[size++];
                }
                return (E) index;
            }
        }

        @Override
        public Iterator<E> iterator () {
            return new ArrayIterator();
        }
    }
