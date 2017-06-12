package ru.job4j.Tracker;

/**
 * Created by Comp on 12.06.2017.
 */
public class Item {
    public String key;
    public String id;
    public String name;
    public String desc;
    public String[] comments;
    public long created;

    public Item(String key, String id, String name, String desc, String[] comments, long created) {
        this.key = key;
        this.id = id;
        this.name = name;
        this.desc = desc;
        this.comments = comments;
        this.created = created;
    }

    public String getKey() {
        return key;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDesc() {
        return desc;
    }

    public String[] getComment() {
        return comments;
    }

    public long getCreated() {
        return created;
    }
}
