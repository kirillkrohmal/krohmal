package ru.job4j.TrackerSQL;

/**
 * Created by Comp on 14.06.2017.
 */
public class Task extends Item {
    public Task(String key, String id, String name, String desc, String[] comments, long created) {
        super(key, id, name, desc, comments, created);
    }

    public Task(String id) {
        super(id);
    }

    public Task(String name, String id) {
        super(name, id);
    }

    public Task(String key, String id, String name, String desc, long creat) {
        super(key, id, name, desc, creat);
    }
}
