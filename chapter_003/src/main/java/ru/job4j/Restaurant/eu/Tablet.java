package ru.job4j.Restaurant.eu;

import ru.job4j.Restaurant.exception.NoVideoAvailableException;
import ru.job4j.Restaurant.kitchen.Dish;
import ru.job4j.Restaurant.kitchen.Order;

import java.io.IOException;
import java.util.EmptyStackException;
import java.util.List;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 * Created by Comp on 10.09.2017.
 */
public class Tablet {
    private static int number = 0;
    private LinkedBlockingQueue<Order> queue;

    private static Logger log = Logger.getLogger(Tablet.class.getName());

    public Tablet(int number) {
        this.number = number;
    }

    public void createOrder() {
        Order order = null;
        //try {
            order = new Order(this);
            if (!order.isEmpty()) {

            } else {
            }
        /*} catch (IOException e) {
            log.log(Level.SEVERE, "Console is unavailable.");
        } catch (NoVideoAvailableException e) {
            log.log(Level.INFO, "" + order);
        } catch (InterruptedException e) {}
    }

    @Override
    public String toString() {
        return "Tablet{" +
                "queue=" + queue +
                '}';*/

    }
}
