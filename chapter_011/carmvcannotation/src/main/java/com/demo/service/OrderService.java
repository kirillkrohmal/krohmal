package com.demo.service;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import com.demo.models.Orders;

import java.io.IOException;
import java.util.List;

@Service
public interface OrderService {
    List<Orders> getOrders();

    void add(Orders orders);

    Orders uploadOrders(Orders orders, MultipartFile file) throws IOException;
}
