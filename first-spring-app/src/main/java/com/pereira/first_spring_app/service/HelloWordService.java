package com.pereira.first_spring_app.service;

import org.springframework.stereotype.Service;

@Service
public class HelloWordService {
    public String helloWord(String name){
        return "Hello Video " + name;
    }
}
