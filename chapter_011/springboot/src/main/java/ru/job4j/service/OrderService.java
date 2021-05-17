package ru.job4j.service;

import org.springframework.web.multipart.MultipartFile;
import ru.job4j.models.*;

import java.io.IOException;
import java.util.List;


public interface OrderService {
    List<Orders> getOrders();

    Orders uploadOrders(Orders orders, MultipartFile file) throws IOException;

    Orders save(Orders orders);

    Body saveBody(Body body);

    Orders findById(int id);

    List<Body> getBody();

    List<Brand> getBrand();

    List<Engine> getEngine();

    List<Models> getModel();
}
