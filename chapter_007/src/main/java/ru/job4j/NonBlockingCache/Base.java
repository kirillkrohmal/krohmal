package ru.job4j.NonBlockingCache;

/**
 * Created by Comp on 26.07.2018.
 */
public class Base {
    private int id;
    private int version;

    public Base() {
    }

    public Base(int id, int version) {
        this.id = id;
        this.version = version;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }
}
