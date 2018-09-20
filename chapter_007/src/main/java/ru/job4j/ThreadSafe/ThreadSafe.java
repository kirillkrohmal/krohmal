package ru.job4j.ThreadSafe;

import ru.job4j.DynamicListThread.DynamicListThread.DynamicListThread;

import java.util.Iterator;

/**
 * Created by Comp on 04.09.2018.
 */
public class ThreadSafe<E> extends DynamicListThread {

    private Object array;

    @Override
    public synchronized Iterator<E> iterator() {
        return copy(this.array).iterator();

    }



    void copy () {
        
    }
}
