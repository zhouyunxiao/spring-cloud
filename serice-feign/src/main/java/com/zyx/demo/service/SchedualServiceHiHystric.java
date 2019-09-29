package com.zyx.demo.service;

import org.springframework.stereotype.Component;

import com.zyx.demo.interfaces.SchedualServiceHi;

@Component
public class SchedualServiceHiHystric implements SchedualServiceHi {
    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry "+name;
    }
}
