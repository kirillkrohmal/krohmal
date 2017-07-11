package ru.job4j.Tracker;

import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

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
        //return String.valueOf(new Random().nextInt(items.length) + 1);
        return String.valueOf(System.currentTimeMillis() + random.nextInt());
    }

    public void delete(String id) {
        Item result = null;

        for (int i = 0; i < items.length; i++) {
            if (items[i] != null && items[i].getId().equals(id)) {
                //System.arraycopy(items[size], 0, items[size - 1], i - 1, items.length);
                //
                items[i] = null;
                items[i] = items[size - 1];
                items[size - 1] = null;
                size--;
                return;
            }
        }
    }

    public void exit() {
        System.exit(0);
    }

    public void update(Item freshItem) {
        for (int i = 0; i < items.length; i++) {
            if (items[i] != null && items[i].getId().equals(freshItem.getId())) {
                items[i] = freshItem;
                break;
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

    public Item findByName(String name) {
        Item result = null;

        for (Item item : items) {
            if (item.getName().equals(name) && items != null) {
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
