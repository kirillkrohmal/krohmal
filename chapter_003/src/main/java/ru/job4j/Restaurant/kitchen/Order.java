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

    public List<Dish> dishes() {
        return dishes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Order order = (Order) o;

        if (tablet != null ? !tablet.equals(order.tablet) : order.tablet != null) return false;
        return dishes != null ? dishes.equals(order.dishes) : order.dishes == null;
    }

    @Override
    public int hashCode() {
        int result = tablet != null ? tablet.hashCode() : 0;
        result = 31 * result + (dishes != null ? dishes.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return dishes.isEmpty() ? "" : "Your order: " + dishes + " of " + tablet;
    }
}
