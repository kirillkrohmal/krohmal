package ru.job4j.threadsafe;

import ru.job4j.dynamiclistthread.dynamiclistthread.DynamicListThread;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Comp on 04.09.2018.
 */
public class ThreadSafe<E> extends DynamicListThread {
    private DynamicListThread array;
    private LinkedList<Integer> linkedList = new LinkedList<Integer>();

    public ThreadSafe(DynamicListThread array) {
        this.array = array;
    }

    @Override
    public synchronized Iterator<E> iterator() {
        return copy(this.array).iterator();

    }

    synchronized List<E> copy(DynamicListThread array) {

        for (Integer aLinkedList : linkedList) {
            array.add(aLinkedList);
        }

        return (List<E>) array;
    }
}
