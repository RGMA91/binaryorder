package com.example.binaryorder.controller;

import com.example.binaryorder.service.NumberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/number")
public class NumberController {

    @Autowired
    private NumberService numberService;

    @GetMapping(value = "/order")
    public List<Integer> orderByBinaryOrdinalAscending(@RequestParam Integer[] values) {
        return numberService.orderByBinaryOrdinalAscending(values);
    }

}
