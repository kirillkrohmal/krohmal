package ru.job4j.Tracker;

/**
 * Created by Comp on 12.04.2019.
 */
public class Task extends Item {
    public Task(String id, String name) {
        super(id, name);
    }


    public Task(String key, String id, String name, String desc, long creat) {
        super(key, id, name, desc, creat);
    }
}
