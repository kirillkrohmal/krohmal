package ru.job4j.Tracker;


/**
 * Created by Comp on 12.06.2017.
 */
public class Item {
    private String key;
    private String id;
    private String name;
    private long creat;
    private String desc;


    public Item(String key, String id, String name, long created, String desc) {
        this.key = key;
        this.id = id;
        this.name = name;
        this.creat = created;
        this.desc = desc;
    }

    public Item(String key, String s, String id, String name, long creat) {
        this.id = id;
        this.name = name;
    }

    public Item(String id, String name) {
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getCreated() {
        return creat;
    }

    public void setCreated(long created) {
        this.creat = created;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Item item = (Item) o;

        if (creat != item.creat) return false;
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
        result = 31 * result + (int) (creat ^ (creat >>> 32));
        result = 31 * result + (desc != null ? desc.hashCode() : 0);
        return result;
    }
}
