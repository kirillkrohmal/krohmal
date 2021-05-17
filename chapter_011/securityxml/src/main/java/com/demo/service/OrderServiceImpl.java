package com.demo.service;

import com.demo.models.Orders;
import com.demo.repository.Dao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;


@Service
public class OrderServiceImpl implements OrderService {

    private Dao dao;

    @Autowired
    public OrderServiceImpl(Dao dao) {
        this.dao = dao;
    }

    @Override
    public List<Orders> getOrders() {
        return dao.getAllOrders();
    }

    @Override
    public void add(Orders orders) {
        dao.addAll(orders);
    }

    @Override
    public Orders uploadOrders(Orders orders, MultipartFile file) throws IOException {
        if (!file.isEmpty()) {
            String uploadDir = file.getOriginalFilename();

            orders.setImage(file.getBytes());
            orders.setImageStr(uploadDir);
        }

        return orders;
    }
}
