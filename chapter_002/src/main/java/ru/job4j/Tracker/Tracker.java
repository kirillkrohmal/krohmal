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

    public Item add(Item item) {
        if (size == STORAGE_SIZE - 1) {
            System.out.println(("Вводить заявки больше нельзя! Объем полон"));
        }
        item.setId(this.generateId());
        items[size++] = item;
        return item;
    }

    String generateId() {
        return String.valueOf(new Random().nextInt(items.length) + 1);
        //return String.valueOf(System.currentTimeMillis() + random.nextInt());
    }

    public void delete(String id) {
        for (Item item : items) {
            if (item.getId().equals(id) && item != null) {
                item = null;
                return;
            }
            //System.arraycopy();
        }
    }

    public void edit (Item freshItem) {
        for (int i = 0; i != items.length;++i) {
            Item item = items[i];
            if (item.getId().equals(freshItem.getId()) && item != null) {
                items[i] = freshItem;
                break;
            }
        }
    }

    public void update(Item item) {
        Item result = null;

        for (int i = 0; i < size; i++) {
            if (items[i].getId().equals(item)) {
                result = items[i];
                item = result;
            }
        }
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

    public Item findById(String id) {
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
