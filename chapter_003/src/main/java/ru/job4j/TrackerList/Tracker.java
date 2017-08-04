package ru.job4j.TrackerList;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by Comp on 12.06.2017.
 */
public class Tracker {
    private final int STORAGE_SIZE = 100;
    ArrayList<Item> items = new ArrayList<>(STORAGE_SIZE);
    private int size = 0;
    private static final Random random = new Random();

    public Item add(Item item) {
        if (size == STORAGE_SIZE - 1) {
            System.out.println(("Вводить заявки больше нельзя! Объем полон"));
        }

        //item.setId(generateId());
        items.set(size++, item);
        return item;
    }

    String generateId() {
        //return String.valueOf(new Random().nextInt(items.size()) + 100);
        return String.valueOf(System.currentTimeMillis() + random.nextInt());
    }

    public void delete(ArrayList<String> id) {
        Item result = null;

        for (int i = 0; i < items.size(); i++) {
            if (items.get(i) != null && items.get(i).getId().equals(id)) {
                //System.arraycopy(items[size], 0, items[size - 1], i - 1, items.length);
                items.set(i, null);
                items.set(i, items.get(size - 1));
                items.set(size - 1, null);
                size--;
                return;
            }
        }
    }

    public void exit() {
        System.exit(0);
    }

    public void update(Item freshItem) {
        for (int i = 0; i < items.size(); i++) {
            if (items.get(i) != null && items.get(i).getId().equals(freshItem.getId())) {
                items.set(i, freshItem);
                break;
            }
        }
    }

    public List<Item> findAll() {
        List<Item> result = new ArrayList<Item>(size);

        for (int i = 0; i < size; i++) {
            result.set(i, this.items.get(i));
        }
        return result;
    }

    public Item findByName(ArrayList<String> name) {
        Item result = null;

        for (Item item : items) {
            if (item.getName().equals(name) && items != null) {
                result = item;
                break;
            }
        }
        return result;
    }

    public Item findById(ArrayList<String> id) {
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
