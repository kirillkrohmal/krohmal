package ru.job4j.Tracker;

/**
 * Created by Comp on 12.06.2017.
 */
public class Item {
    private String key;
    private String id;
    private String name;
    private String desc;
    private String[] comments;
    private long created;

    public Item(String key, String id, String name, String desc, String[] comments, long created) {
        this.key = key;
        this.id = id;
        this.name = name;
        this.desc = desc;
        this.comments = comments;
        this.created = created;
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
}
