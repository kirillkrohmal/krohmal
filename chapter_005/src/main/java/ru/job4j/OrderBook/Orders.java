package ru.job4j.OrderBook;

import java.util.Objects;

/**
 * Created by Comp on 12.11.2017.
 */
public class Orders {
    private int id;
    private Book book;
    private Type type;
    private OrderBook action;
    private float price;
    private int volume;

    public enum Type {
        SELL, BUY;
    }

    public Orders() {
    }

    public Orders(int id, Book book, Type type, OrderBook action, float price, int volume) {
        this.id = id;
        this.book = book;
        this.type = type;
        this.action = action;
        this.price = price;
        this.volume = volume;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public OrderBook getAction() {
        return action;
    }

    public void setAction(OrderBook action) {
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

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
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
