package ru.job4j.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    @RequestMapping("/")
    public String homeAction() {
        return "index";
    }
}
