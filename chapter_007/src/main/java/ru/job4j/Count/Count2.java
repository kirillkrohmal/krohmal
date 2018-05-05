package ru.job4j.Count;

import net.jcip.annotations.GuardedBy;
import net.jcip.annotations.ThreadSafe;

/**
 * Created by Comp on 29.10.2017.
 */
@ThreadSafe
public class Count2 {
    @GuardedBy("this")
    private int value;

    public void increment() {
        this.value++;
    }

    public synchronized int get() {
        return this.value;
    }

/*
    @GuardedBy("this")
    private int count;

    public synchronized int counting () {
        return ++this.count;
    }
*/
}
