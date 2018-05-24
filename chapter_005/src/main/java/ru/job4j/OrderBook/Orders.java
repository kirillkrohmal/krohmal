package ru.job4j.OrderBook;

import java.util.Objects;

/**
 * Created by Comp on 12.11.2017.
 */
public class Orders {
    private final OrderBook orderBook;
    OrderBook volume;
    private Type action;
    float price;
    int book;
    int id;
    Type type;


    public enum Type {
        SELL, BUY;
    }

    Orders(int book, Type type, float price, OrderBook volume, OrderBook orderBook, int id) {
        this.volume = volume;
        this.orderBook = orderBook;
        this.price = price;
        this.book = book;
        this.id = id;
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getBook() {
        return book;
    }

    public void setBook(int book) {
        this.book = book;
    }

    public void setVolume(OrderBook volume) {
        this.volume = volume;
    }

    public Type getAction() {
        return action;
    }

    public void setAction(Type action) {
        this.action = action;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public OrderBook getVolume() {
        return volume;
    }

    public OrderBook getOrderBook() {
        return orderBook;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Orders orders = (Orders) o;
        return id == orders.id &&
                Float.compare(orders.price, price) == 0 &&
                volume == orders.volume &&
                Objects.equals(book, orders.book) &&
                type == orders.type &&
                Objects.equals(action, orders.action);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, book, type, action, price, volume);
    }

    @Override
    public String toString() {
        return "Orders{" +
                "id=" + id +
                ", book=" + book +
                ", type=" + type +
                ", action=" + action +
                ", price=" + price +
                ", volume=" + volume +
                '}';
    }
}
