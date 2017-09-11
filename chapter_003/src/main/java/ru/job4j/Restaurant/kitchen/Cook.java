package ru.job4j.Restaurant.kitchen;

/**
 * Created by Comp on 10.09.2017.
 */
public class Cook {
    String name;

    public Cook(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Cook{" +
                "name='" + name + '\'' +
                '}';
    }
}
