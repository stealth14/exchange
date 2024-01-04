package com.example.exchange.api.service;

import org.springframework.stereotype.Service;

import com.example.exchange.api.model.Rate;

@Service
public class RateService {

    public RateService(){}

    public Rate getRate(String source, String target, String date){
       return new Rate("","","");
    }

}
