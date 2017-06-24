package ru.job4j.Tracker;

/**
 * Created by Comp on 14.06.2017.
 */
public class Task extends Item {
    public Task(String name,String desc) {
        super(name, desc);
    }

    public String calculatePrice() {
        return "100";
    }
}
