package ru.job4j.trackerlist;

/**
 * Created by Comp on 14.06.2017.
 */
public class Task extends Item {
    public Task(String key, String id, String name, String desc, long created) {
        super(key, id, name, desc, created);
    }

    public Task(String id, String name) {
        super(id, name);
    }

    public Task(String id) {
        super(id);
    }
}
