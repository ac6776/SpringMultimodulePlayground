package com.example.springplaygroundnew;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class MyRepo {
    public List<String> getStrings() {
        return List.of("String", "Hello world!", "Another String");
    }
}
