package ru.job4j.Count;

import net.jcip.annotations.GuardedBy;
import net.jcip.annotations.ThreadSafe;

/**
 * Created by Comp on 28.10.2017.
 */
@ThreadSafe
public class CountIncrement implements Runnable {
    @GuardedBy("lock")
    Count count = new Count();
    Count2 count2 = new Count2();

    private Object lock = new Object();

    public CountIncrement(Count count, Count2 count2) {
        this.count = count;
        this.count2 = count2;
    }

    @Override
    public void run() {
        System.out.println(count.counting());
        System.out.println(count2.counting());
    }

    public static void main(String[] args) {
        Count count = new Count();
        Count2 count2 = new Count2();
        new Thread(new CountIncrement(count, count2)).start();

        new Thread(new CountIncrement(count, count2)).start();
    }
}
