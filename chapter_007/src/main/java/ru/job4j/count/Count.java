package ru.job4j.count;

import net.jcip.annotations.GuardedBy;
import net.jcip.annotations.ThreadSafe;

/**
 * Created by Comp on 29.10.2017.
 */
@ThreadSafe
public class Count {
    @GuardedBy("this")
    private int value = 1;

    public void increment() {
        this.value++;
    }

    public synchronized int get() {
        return this.value;
    }
}
