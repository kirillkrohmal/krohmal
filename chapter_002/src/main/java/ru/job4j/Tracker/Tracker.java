package ru.job4j.Tracker;

/**
 * Created by Comp on 12.06.2017.
 */
public class Tracker {

    Item[] item = new Item[]{};

  /*  public Tracker(String key, String id, String name, String desc, String[] comment, long created) {
        super(key, id, name, desc, comment, created);
    }*/

    public Item add(Item item) {

        return null;
    }

    public void delete(Item item) {

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
