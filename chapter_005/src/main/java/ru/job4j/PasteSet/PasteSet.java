package ru.job4j.PasteSet;

/**
 * Created by Comp on 25.09.2017.
 */

public class PasteSet {
    private Object[] value;
    private int size;
    private int id;

    public PasteSet() {
        this.value = new Object[1000];
    }

    public PasteSet(Object[] value, int size, int id) {
        this.value = value;
        this.size = size;
        this.id = id;
    }
}
