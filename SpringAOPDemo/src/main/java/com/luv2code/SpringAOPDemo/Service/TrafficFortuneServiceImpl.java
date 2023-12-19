package com.luv2code.SpringAOPDemo.Service;

import java.util.concurrent.TimeUnit;

import org.springframework.stereotype.Service;

@Service
public class TrafficFortuneServiceImpl implements TrafficFortuneService{

    @Override
    public String getFortune() {
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
           throw new RuntimeException(e);
        }
        return "Expected Heavy Traffic from this morning";
    }    
}
