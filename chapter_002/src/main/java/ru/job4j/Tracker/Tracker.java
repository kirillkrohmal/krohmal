package ru.job4j.Tracker;

/**
 * Created by Comp on 12.06.2017.
 */
public class Tracker extends Item{
    private final int STORAGE_SIZE = 100;
    Item[] item = new Item[STORAGE_SIZE];
    private int size = 0;


    public Tracker(String key, String id, String name, String desc, String[] comment, long created) {
        super(key, id, name, desc, comment, created);
    }

    public Item add(Item[] item) {

        if (size <= STORAGE_SIZE - 1) {
            System.out.println(getName() + " " + getDesc() + " " + getCreated() + " " + getComment());

        }
        if (size == STORAGE_SIZE - 1) {
            System.out.println("объем полон");
        }
        size++;
        return item[size];
    }

    public void delete(Item item) {
        for (int i = 0; i < STORAGE_SIZE; i++) {

        }
        
        
    }

    public Item[] findAll() {

        return new Item[0];
    }

    public Item[] findByName(String key) {

        return new Item[0];
    }

    public Item findById(String id) {

        return null;
    }
}
