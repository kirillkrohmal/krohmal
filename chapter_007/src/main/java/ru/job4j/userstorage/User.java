package ru.job4j.userstorage;

/**
 * Created by Comp on 29.10.2017.
 */
public class User {
    private int id;
    private int amount;

    public User(int id, int amount) {
        this.id = id;
        this.amount = amount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        User user = (User) o;

        if (id != user.id) {
            return false;
        }
        return amount == user.amount;
    }


    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + amount;
        return result;
    }
}
