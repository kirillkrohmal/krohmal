package ru.job4j.OrderBook;

/**
 * Created by Comp on 12.11.2017.
 */
public class Orders {
    public enum Type {
        SELL, BUY;
    }

    private String book;
    private Type type;
    private float price;
    private int volume;
    private int orderId;

    public Orders(String book, Type type, float price, int volume, int orderId) {
        this.book = book;
        this.type = type;
        this.price = price;
        this.volume = volume;
        this.orderId = orderId;
    }

    public String getBook() {
        return book;
    }

    public void setBook(String book) {
        this.book = book;
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

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Orders orders = (Orders) o;

        if (Float.compare(orders.price, price) != 0) return false;
        if (volume != orders.volume) return false;
        if (orderId != orders.orderId) return false;
        if (book != null ? !book.equals(orders.book) : orders.book != null) return false;
        return type == orders.type;
    }

    @Override
    public int hashCode() {
        int result = book != null ? book.hashCode() : 0;
        result = 31 * result + (type != null ? type.hashCode() : 0);
        result = 31 * result + (price != +0.0f ? Float.floatToIntBits(price) : 0);
        result = 31 * result + volume;
        result = 31 * result + orderId;
        return result;
    }

    @Override
    public String toString() {
        return "Orders{" +
                "book='" + book + '\'' +
                ", type=" + type +
                ", price=" + price +
                ", volume=" + volume +
                ", orderId=" + orderId +
                '}';
    }
}
