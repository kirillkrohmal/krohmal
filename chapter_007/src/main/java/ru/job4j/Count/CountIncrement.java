package ru.job4j.Count;

import net.jcip.annotations.GuardedBy;
import net.jcip.annotations.ThreadSafe;

/**
 * Created by Comp on 28.10.2017.
 */
@ThreadSafe
public class CountIncrement implements Runnable {
    @GuardedBy("this")
    private static Count count = new Count();
    @GuardedBy("this")
    private static Count count2 = new Count();

    private Object lock = new Object();

    private CountIncrement(Count count, Count count2) {
        CountIncrement.count = count;
        CountIncrement.count2 = count2;
    }

    @Override
    public void run() {
        System.out.println(count.get());
        System.out.println(count2.get());
    }

    public static void main(String[] args) {
        Count count = new Count();
        Count count2 = new Count();
        new Thread(new CountIncrement(count, count2)).start();
    }
}
