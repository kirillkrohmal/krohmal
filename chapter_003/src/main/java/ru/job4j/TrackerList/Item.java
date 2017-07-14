package ru.job4j.TrackerList;

import java.util.Arrays;

/**
 * Created by Comp on 12.06.2017.
 */
public class Item {
    private String key;
    private String id;
    private String name;
    private String[] comments;
    private String desc;
    private long created;

    public Item(String key, String id, String name, String desc, long created) {
        this.key = key;
        this.id = id;
        this.name = name;
        this.desc = desc;
        this.created = created;
        this.comments = comments;
    }

    public Item(String id) {
        this.id = id;
    }

    public Item(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getKey() {
        return this.key;
    }

    public String getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public String getDesc() {
        return this.desc;
    }

    public String[] getComment() {
        return this.comments;
    }

    public long getCreated() {
        return this.created;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public void setComments(String[] comments) {
        this.comments = comments;
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
        // Probably incorrect - comparing Object[] arrays with Arrays.equals
        if (!Arrays.equals(comments, item.comments)) return false;
        return desc != null ? desc.equals(item.desc) : item.desc == null;
    }

    @Override
    public int hashCode() {
        int result = key != null ? key.hashCode() : 0;
        result = 31 * result + (id != null ? id.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + Arrays.hashCode(comments);
        result = 31 * result + (desc != null ? desc.hashCode() : 0);
        result = 31 * result + (int) (created ^ (created >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "Item{" +
                "key='" + key + '\'' +
                ", id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", comments=" + Arrays.toString(comments) +
                ", desc='" + desc + '\'' +
                ", created=" + created +
                '}';
    }
}
