package ru.job4j.Tracker;

import java.util.Random;

/**
 * Created by Comp on 12.06.2017.
 */
public class Tracker {
    private final int STORAGE_SIZE = 100;
    Item[] items = new Item[STORAGE_SIZE];
    private int size = 0;
    private static final Random random = new Random();

/*
    public Tracker(String key, String id, String name, String desc, String[] comment, long created) {
        super(key, id, name, desc, comment, created);
    }
*/

    public Item add(Item item) {
        if (size == STORAGE_SIZE - 1) {
            String.format("Вводить заявки больше нельзя! Объем полон");
        }
        item.setId(this.generateId());
        items[size++] = item;
        return item;
    }

    String generateId() {
        return String.valueOf(System.currentTimeMillis() + random.nextInt());
    }

   /* public int getIndex(String id) {
        for (int i = 0; i < size; i++) {
            if (items[i].getId().equals(id)) {
                return i;
            }
        }
        return size;
    }*/

    public void delete(String id) {
        for (int i = 0; i < size; i++) {
            if (items[i].getId().equals(id)){
                items[i] = null;
            }
        }
    }

    public void update(Item item) {

    }

    public Item[] findAll() {
        Item[] result = new Item[size];

        for (int i = 0; i < size; i++) {
            result[i] = this.items[i];
        }
        return result;
    }

    public Item findByName(String key) {
        Item result = null;
        for (Item item : items) {
            if (item.getKey().equals(key) && items != null) {
                result = item;
                break;
            }
        }
        return result;
    }

    protected Item findById(String id) {

        Item result = null;

        for (Item item : items) {
            if (item.getId().equals(id) && items != null) {
                result = item;
                break;
            }
        }
        return result;
    }
}
