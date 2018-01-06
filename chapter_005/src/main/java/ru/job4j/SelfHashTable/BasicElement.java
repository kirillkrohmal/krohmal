package ru.job4j.SelfHashTable;

/**
 * Created by Comp on 07.01.2018.
 */
public class BasicElement {
    private int key;
    private int value;
    private int hash;

    public BasicElement(int key, int value, int hash) {
        this.key = key;
        this.value = value;
        this.hash = hash;
    }

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getHash() {
        return hash;
    }

    public void setHash(int hash) {
        this.hash = hash;
    }
}
