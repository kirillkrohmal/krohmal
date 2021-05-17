package com.demo.repository;

import org.springframework.stereotype.Repository;
import com.demo.models.Orders;

import java.util.List;

@Repository
public interface Dao {
    List<Orders> getAllOrders();

    void addAll(Orders orders);
}
