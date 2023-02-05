package ru.job4j.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;
import ru.job4j.models.Orders;
import ru.job4j.repository.Dao;

import javax.annotation.Resource;
import java.io.IOException;
import java.util.List;


@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private Dao dao;

    @Override
    public List<Orders> getOrders() {
        return Lists.newArrayList(dao.findAll());
    }

    @Override
    public void save(Orders orders) {
        dao.save(orders);
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
