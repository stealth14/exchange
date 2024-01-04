package com.example.exchange.api.controller;

import com.example.exchange.api.model.Rate;
import com.example.exchange.api.service.RateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RateController {

    private final RateService rateService;

    @Autowired
    public RateController(RateService rateService) {
        this.rateService = rateService;
    }

    @GetMapping("/rates")
    public Rate getRate(String source, String target, String date){
        return rateService.getRate(source, target, date);
    }

}
