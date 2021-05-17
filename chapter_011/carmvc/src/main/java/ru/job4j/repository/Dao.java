package ru.job4j.repository;


import ru.job4j.models.Orders;

import java.util.List;


public interface Dao {
    List<Orders> getAllOrders();

    void addAll(Orders orders);
}
