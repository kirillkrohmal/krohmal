package ru.job4j.model;

public class Role {
    private String desc;

    public Role(String desc) {
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
        return "Role{" +
                "desc='" + desc + '\'' +
                '}';
    }
}
