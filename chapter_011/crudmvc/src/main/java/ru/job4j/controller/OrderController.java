package ru.job4j.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import ru.job4j.models.Orders;
import ru.job4j.service.OrderService;

import java.io.IOException;


@Controller
@RequestMapping("/general")
public class OrderController {

    @Autowired
    @Qualifier("orderServiceImpl")
    private OrderService orderService;


    @GetMapping(value = "/list")
    public String get(Model theModel) {

        theModel.addAttribute("orders", orderService.getOrders());

        return "index";
    }

    @GetMapping(value = "/showFormForAdd")
    public String add(Model theModel) {
        Orders orders = new Orders();

        theModel.addAttribute("order", orders);

        return "create-orders";
    }

    @PostMapping(value = "/saveOrders", consumes = "multipart/form-data")
    public String addOrders(@ModelAttribute("order") Orders orders, @RequestParam("file") MultipartFile file) throws IOException {
        orders = orderService.uploadOrders(orders, file);
        orderService.save(orders);

        return "redirect:/general/list";
    }
}
