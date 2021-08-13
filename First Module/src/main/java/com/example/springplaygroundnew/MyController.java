package com.example.springplaygroundnew;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MyController {
    private MyRepo repo;

    @Autowired
    public void setRepo(MyRepo repo) {
        this.repo = repo;
    }

    @GetMapping
    public List<String> show(){
        return repo.getStrings();
    }
}
