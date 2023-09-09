package ru.job4j.service;


import com.google.common.collect.Lists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import ru.job4j.models.*;
import ru.job4j.repository.*;

import java.io.IOException;
import java.util.List;
import java.util.Optional;


@Service
@Qualifier("orderServiceImpl")
public class OrderServiceImpl implements OrderService {
    @Autowired
    private OrderDao dao;

    @Autowired
    private  BodyDao bodyDao;

    @Autowired
    private BrandDao brandDao;

    @Autowired
    private EngineDao engineDao;

    @Autowired
    private ModelDao modelDao;

    public OrderServiceImpl(OrderDao dao) {
        this.dao = dao;
    }

    @Override
    public List<Orders> getOrders() {
        return Lists.newArrayList(dao.findAll());
    }

    @Override
    public Orders save(Orders orders) {
        return dao.save(orders);
    }

    @Override
    public Body saveBody(Body body) {
        return bodyDao.save(body);
    }

    @Override
    public Orders findById(int id) {
        Optional<Orders> orders = dao.findById(id);

        return orders.get();
    }

    @Override
    public List<Body> getBody() {
        return Lists.newArrayList(bodyDao.findAll());
    }

    @Override
    public List<Brand> getBrand() {
        return Lists.newArrayList(brandDao.findAll());
    }

    @Override
    public List<Engine> getEngine() {
        return Lists.newArrayList(engineDao.findAll());
    }

    @Override
    public List<Models> getModel() {
        return Lists.newArrayList(modelDao.findAll());
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
