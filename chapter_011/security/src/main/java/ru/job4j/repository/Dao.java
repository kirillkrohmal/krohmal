package ru.job4j.repository;

import org.hibernate.SessionFactory;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.job4j.models.Orders;
import ru.job4j.models.User;

import java.util.List;


public interface Dao {
    List<Orders> getAllOrders();

    void addAll(Orders orders);
}
