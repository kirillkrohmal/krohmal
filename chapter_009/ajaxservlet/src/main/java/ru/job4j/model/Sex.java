package ru.job4j.model;

public class Sex {
    private String desc;

    public Sex(String desc) {
        this.desc = desc;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    @Override
    public String toString() {
        return "Sex{" +
                "desc='" + desc + '\'' +
                '}';
    }
}
