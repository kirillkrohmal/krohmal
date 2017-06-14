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

    public Item add(Item item) {

        if (size <= STORAGE_SIZE - 1) {
            String.format("" + getId());
            String.format(getName() + " " + getDesc() + " " + getCreated() + " " + getComment());

        }
        if (size == STORAGE_SIZE - 1) {
            String.format("Вводить заявки больше нельзя! Объем полон");
        }
        size++;
        return item;
    }
    
    public int getIndex (String id) {
        for (int i = 0; i < size; i++) {
            if (item[i].getId().equals(id)) {
                return i;
            }
        }
        return size;
    }

    public void delete(String id) {

        String.format("Введите id: ");


        for (int i = 0; i < size; i++) {


        }
    }




    public void update(Item item) {

    }

    public Item[] findAll() {

        return new Item[0];
    }

    public Item[] findByName(String key) {

        return null;
    }

    protected Item findById(String id) {

        int index = getIndex(id);

        return null;
    }


}
