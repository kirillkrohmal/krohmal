package ru.job4j.Restaurant.kitchen;

/**
 * Created by Comp on 10.09.2017.
 */
public enum Dish {
    Fish,
    Steak,
    Soup,
    Juice,
    Water;

    public static String allDishesToString() {
        String dishes = "";

        for (Object o : Dish.values()) {
            dishes.concat(o + " ");
        }
        return String.valueOf((dishes.length() != 0));
    }
}
