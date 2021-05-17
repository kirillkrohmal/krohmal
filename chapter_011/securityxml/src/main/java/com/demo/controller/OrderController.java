package com.demo.controller;


import com.demo.models.Orders;
import com.demo.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;


@Controller
public class OrderController {
    @Autowired
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

    @PostMapping(value = "/saveOrders")
    public String addOrders(@ModelAttribute("order") Orders orders, @RequestParam("picture") MultipartFile file) throws IOException {
        orders = orderService.uploadOrders(orders, file);
        orderService.add(orders);

        return "redirect:/list";
    }
}
