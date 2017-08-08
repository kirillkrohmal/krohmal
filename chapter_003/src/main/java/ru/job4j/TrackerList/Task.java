package ru.job4j.TrackerList;

import java.util.ArrayList;

/**
 * Created by Comp on 14.06.2017.
 */
public class Task extends Item {
    public Task(ArrayList<String> key, String id, ArrayList<String> name, ArrayList<String> desc, long created) {
        super(key, id, name, desc, created);
    }

    public Task(ArrayList<String> id, ArrayList<String> name) {
        super(id, name);
    }

    public Task(String id) {
        super(id);
    }
}
