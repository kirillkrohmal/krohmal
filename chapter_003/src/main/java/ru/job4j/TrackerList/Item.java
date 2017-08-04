package ru.job4j.TrackerList;

import java.util.ArrayList;

/**
 * Created by Comp on 12.06.2017.
 */
public class Item {
    private ArrayList<String> key;
    private ArrayList<String> id;
    private ArrayList<String> name;
    private ArrayList<String> desc;
    private long created;

    public Item(ArrayList<String> key, ArrayList<String> id, ArrayList<String> name, ArrayList<String[]> comments, ArrayList<String> desc, long created) {
        this.key = key;
        this.id = id;
        this.name = name;
        this.desc = desc;
        this.created = created;
    }


    public Item(ArrayList<String> id, ArrayList<String> name) {
        this.id = this.id;
        this.name = this.name;
    }

    public Item(ArrayList<String> id) {
        this.id = id;
    }

    public Item(ArrayList<String> key, ArrayList<String> id, ArrayList<String> name, ArrayList<String> desc, long created) {
        this.key = key;
        this.id = id;
        this.name = name;
        this.desc = desc;
        this.created = created;
    }


    public ArrayList<String> getKey() {
        return key;
    }

    public void setKey(ArrayList<String> key) {
        this.key = key;
    }

    public ArrayList<String> getId() {
        return id;
    }

    public void setId(ArrayList<String> id) {
        this.id = id;
    }

    public ArrayList<String> getName() {
        return name;
    }

    public void setName(ArrayList<String> name) {
        this.name = name;
    }

    public ArrayList<String> getDesc() {
        return desc;
    }

    public void setDesc(ArrayList<String> desc) {
        this.desc = desc;
    }

    public long getCreated() {
        return created;
    }

    public void setCreated(long created) {
        this.created = created;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Item item = (Item) o;

        if (created != item.created) return false;
        if (key != null ? !key.equals(item.key) : item.key != null) return false;
        if (id != null ? !id.equals(item.id) : item.id != null) return false;
        if (name != null ? !name.equals(item.name) : item.name != null) return false;
        return desc != null ? desc.equals(item.desc) : item.desc == null;
    }

    @Override
    public int hashCode() {
        int result = key != null ? key.hashCode() : 0;
        result = 31 * result + (id != null ? id.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (desc != null ? desc.hashCode() : 0);
        result = 31 * result + (int) (created ^ (created >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "Item{" +
                "key=" + key +
                ", id=" + id +
                ", name=" + name +
                ", desc=" + desc +
                ", created=" + created +
                '}';
    }
}
