package com.example.test.controllers;

import com.example.test.model.Operation;
import com.example.test.model.OperationResult;
import com.example.test.model.OperationType;
import com.example.test.services.OperationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;

@Controller
public class MainController {

    @Autowired
    private OperationService service;

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("operation", new Operation(
                BigDecimal.ZERO,
                BigDecimal.ZERO,
                OperationType.ADD));
        model.addAttribute("operationResult", new OperationResult(BigDecimal.ZERO));
        return "index";
    }

    @PostMapping(value = "/todo", consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
    public String add(@ModelAttribute Operation operation, Model model) {
        model.addAttribute("operationResult", service.calculate(operation));
        return "index";
    }
}
