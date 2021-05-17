package com.demo.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import com.demo.models.Orders;
import com.demo.service.OrderService;

import java.io.IOException;


@Controller
@RequestMapping("/general")
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
        return "redirect:/general/list";
    }
}
