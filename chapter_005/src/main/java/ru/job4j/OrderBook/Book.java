package ru.job4j.OrderBook;

import java.util.Collection;
import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

/**
 * Created by Comp on 12.11.2017.
 */
public class Book {
    private Collection<Orders> orders;

    public Book(Collection<Orders> orders) {
        this.orders = orders;
    }

    private Comparator<Float> up = new Comparator<Float>() {
        @Override
        public int compare(Float o1, Float o2) {
            return o1.compareTo(o2);
        }
    };

    private Comparator<Float> down = new Comparator<Float>() {
        @Override
        public int compare(Float o1, Float o2) {
            return o2.compareTo(o1);
        }
    };

    public void sum() {
        Map<Float, Orders> sell = new TreeMap<>(down);
        Map<Float, Orders> buy = new TreeMap<>(up);

        for (Orders order : orders) {
            this.add(order.type == Orders.Type.BUY ? buy : sell, order);
        }

        this.show(sell, buy);
    }

    private void show(Map<Float, Orders> sell, Map<Float, Orders> buy) {
        StringBuilder stringBuilder = new StringBuilder();

        for (Orders orders: sell.values()) {
            stringBuilder.append(String.format("\\t\\t%5s %7s\\n", orders.price, orders.volume));
        }
        for (Orders orders: buy.values()) {
            stringBuilder.append(String.format("%7s %5s\\n", orders.price, orders.volume));
        }
    }

    private void add(Map<Float,Orders> sellerMap, Orders order) {
        Orders find = sellerMap.get(order.price);
        if (find != null) {
            final Orders put = sellerMap.put(find.price, new Orders(find.book, find.type, find.price, find.volume, order.volume, find.id));
        } else {
            sellerMap.put(order.price, order);
        }
    }
}
