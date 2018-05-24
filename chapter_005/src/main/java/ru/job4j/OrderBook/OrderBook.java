package ru.job4j.OrderBook;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * Created by Comp on 17.10.2017.
 */
public class OrderBook {
    private static final ExecutorService EXECUTOR = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());

    private final Map<String, HashMap<Integer, Orders>> list;

    public OrderBook(Map<String, HashMap<Integer, Orders>> list) {
        this.list = list;
    }

    /**
     * action - bid/ask - заявка имеет два действия. Заявка на покупка ценной бумаги или на продажу.
     */
    public void matching() throws RuntimeException{
        List<Future> books = new ArrayList<>();
        for (final HashMap<Integer, Orders> hashMap: list.values()) {
            books.add(EXECUTOR.submit(new Callable<Book>() {
                @Override
                public Book call() throws Exception {
                    return null;
                }
            }));
        }
    }
}
