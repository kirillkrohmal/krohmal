package ru.job4j.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import ru.job4j.service.AccidentService;


@Controller
public class IndexController {
    private AccidentService accidentService;

    @Autowired
    public IndexController(AccidentService accidentService) {
        this.accidentService = accidentService;
    }

    @GetMapping
    public String current() {
        return "index.jsp";
    }
}

