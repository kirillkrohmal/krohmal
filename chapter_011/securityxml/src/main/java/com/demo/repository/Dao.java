package com.demo.repository;


import com.demo.models.Orders;

import java.util.List;


public interface Dao {
    List<Orders> getAllOrders();

    void addAll(Orders orders);
}
