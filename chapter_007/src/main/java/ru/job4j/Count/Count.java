package ru.job4j.Count;

/**
 * Created by Comp on 29.10.2017.
 */
public class Count {
    private int count;

    public synchronized int counting () {
        return ++this.count;
    }
}
