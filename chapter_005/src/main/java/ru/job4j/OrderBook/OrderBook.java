package ru.job4j.OrderBook;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.*;

/**
 * Created by Comp on 17.10.2017.
 */
public class OrderBook {
    private static final ExecutorService EXECUTOR = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
    private Map<String, HashMap<Integer, Orders>> list;

    public OrderBook(Map<String, HashMap<Integer, Orders>> list) {
        this.list = list;
    }

    public OrderBook() {
    }

    /**
     * action - bid/ask - заявка имеет два действия. Заявка на покупка ценной бумаги или на продажу.
     */
    public void matching() throws ExecutionException, InterruptedException {
        List<Future<Book>> books = new ArrayList<>(list.size());
        for (final HashMap<Integer, Orders> hashMap : list.values()) {
            books.add(EXECUTOR.submit(new Callable<Book>() {
                @Override
                public Book call() {
                    Book book = new Book(hashMap.values());
                    book.sum();

                    return book;
                }
            }));
        }
        for (Future<Book> book : books) {
            book.get();
        }
        EXECUTOR.shutdown();
    }
}
