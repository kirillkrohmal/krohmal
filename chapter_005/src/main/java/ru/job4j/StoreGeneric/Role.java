package ru.job4j.StoreGeneric;

public class Role extends Base {
    String work;
    int hour;

    public Role(String work, int hour) {
        this.work = work;
        this.hour = hour;
    }

    public String getWork() {
        return work;
    }

    public void setWork(String work) {
        this.work = work;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Role role = (Role) o;

        if (hour != role.hour) return false;
        return work != null ? work.equals(role.work) : role.work == null;
    }

    @Override
    public int hashCode() {
        int result = work != null ? work.hashCode() : 0;
        result = 31 * result + hour;
        return result;
    }

    @Override
    public String toString() {
        return "Role{" +
                "work='" + work + '\'' +
                ", hour=" + hour +
                '}';
    }
}
