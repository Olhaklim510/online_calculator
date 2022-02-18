package com.example.test.controllers;

import com.example.test.model.Operation;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.*;

@Controller
public class MainController {

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("operation", new Operation());
        return "index";
    }

    @PostMapping(value = "/todo", consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
    public String add(@ModelAttribute Operation operation, Model model) {
        System.out.println("Hello : " + operation.getFirstValue());
        operation.setResult(operation.getFirstValue() * operation.getSecondValue());
        return "index";
    }
}
