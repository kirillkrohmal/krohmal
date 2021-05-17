package ru.job4j.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.CacheControl;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import ru.job4j.models.*;
import ru.job4j.service.OrderService;

import java.io.IOException;
import java.util.List;


@Controller
@RequestMapping("/general")
public class OrderController {

    @Autowired
    @Qualifier("orderServiceImpl")
    private OrderService orderService;

    @GetMapping(value = "/list")
    public String get(Model theModel) {

        theModel.addAttribute("orders", orderService.getOrders());

        return "general/index";
    }

    @GetMapping(value = "/showFormForAdd")
    public String add(Model theModel) {
        Orders orders = new Orders();

        List<Body> body = orderService.getBody();
        List<Brand> brand = orderService.getBrand();
        List<Engine> engine = orderService.getEngine();
        List<Models> models = orderService.getModel();

        theModel.addAttribute("bodies", body);
        theModel.addAttribute("brands", brand);
        theModel.addAttribute("engines", engine);
        theModel.addAttribute("models", models);
        theModel.addAttribute("order", orders);

        return "general/create-orders";
    }

    @PostMapping(value = "/saveOrders")
    public String addOrders(@ModelAttribute("order") Orders orders, @RequestParam("picture") MultipartFile file) throws IOException {

        orders = orderService.uploadOrders(orders, file);
        orderService.save(orders);

        return "redirect:/general/list";
    }

    @GetMapping(path = "/{id}/image")
    @ResponseBody
    public ResponseEntity<byte[]> getImageData(@PathVariable int id) {

        byte[] imageData = orderService.findById(id).getImage();

        return ResponseEntity.ok()
                .header(HttpHeaders.CONTENT_TYPE, MediaType.IMAGE_JPEG_VALUE)
                .header(HttpHeaders.CONTENT_TYPE, MediaType.IMAGE_PNG_VALUE)
                .header(HttpHeaders.CACHE_CONTROL, CacheControl.noCache().getHeaderValue())
                .body(imageData);
    }

}
