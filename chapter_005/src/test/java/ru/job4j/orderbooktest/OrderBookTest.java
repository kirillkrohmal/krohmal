package ru.job4j.orderbooktest;

import org.junit.Test;
import ru.job4j.orderbook.Book;
import ru.job4j.orderbook.OrderBook;
import ru.job4j.orderbook.Orders;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created by user on 05.06.2018.
 */
public class OrderBookTest {
    @Test
    public void iteratorTest1() throws ExecutionException, InterruptedException {
        OrderBook orderBook = new OrderBook();
        Book book = new Book();

        Map<Float, Orders> sell = new HashMap<>();
        sell.values();
        Map<Float, Orders> buy = new HashMap<>();
        book.sum();

        orderBook.matching();

        book.remove(sell, buy);
        Orders result = book.show(sell, buy);

        assertThat(result, is(true));
    }

    @Test
    public void iteratorTest2() throws ExecutionException, InterruptedException {
        OrderBook orderBook = new OrderBook();
        Book book = new Book();

        Map<Float, Orders> sell = new HashMap<>();
        Map<Float, Orders> buy = new HashMap<>();

        Orders order = new Orders(book, 143, orderBook);

        //orderBook.matching();

        book.addOrder(sell, order);
        Orders result = book.show(sell, buy);

        assertThat(result, is(true));
    }
}
