package ru.job4j.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;
import ru.job4j.models.Orders;
import ru.job4j.models.User;
import ru.job4j.repository.Dao;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.UUID;


@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    private Dao dao;

    public OrderServiceImpl() {
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
