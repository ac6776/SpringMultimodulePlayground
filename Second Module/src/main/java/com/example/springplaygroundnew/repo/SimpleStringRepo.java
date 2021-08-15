package com.example.springplaygroundnew.repo;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class SimpleStringRepo {
    public List<String> getStrings() {
        return List.of("String", "Hello world!", "Another String");
    }
}
