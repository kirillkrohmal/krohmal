package ru.job4j.Restaurant.kitchen;

import ru.job4j.Restaurant.eu.Tablet;

import java.util.List;

/**
 * Created by Comp on 10.09.2017.
 */
public class Order {
    private Tablet tablet;
    private List<Dish> dishes;

    public Order(Tablet tablet, List<Dish> dishes) {
        this.tablet = tablet;
        this.dishes = dishes;
    }

    public Tablet getTablet() {
        return tablet;
    }

    public void setTablet(Tablet tablet) {
        this.tablet = tablet;
    }

    public List<Dish> getDishes() {
        return dishes;
    }

    public void setDishes(List<Dish> dishes) {
        this.dishes = dishes;
    }

    public Order(Tablet tablet) {

    }

    public List<Dish> dishes() {
        return dishes;
    }

    @Override
    public String toString() {
        return dishes.isEmpty() ? "" : "Your order: " + dishes + " of " + tablet;
    }

    public boolean isEmpty() {
        return dishes.isEmpty();
    }
}
