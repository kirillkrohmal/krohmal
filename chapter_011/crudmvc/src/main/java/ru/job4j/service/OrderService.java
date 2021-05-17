package ru.job4j.service;

import org.springframework.web.multipart.MultipartFile;
import ru.job4j.models.Orders;

import java.io.IOException;
import java.util.List;


public interface OrderService {
    List<Orders> getOrders();

    Orders uploadOrders(Orders orders, MultipartFile file) throws IOException;

    void save(Orders orders);
}
