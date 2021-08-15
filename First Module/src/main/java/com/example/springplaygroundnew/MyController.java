package com.example.springplaygroundnew;

import com.example.springplaygroundnew.entity.BaseEntity;
import com.example.springplaygroundnew.repo.SimpleStringRepo;
import com.example.springplaygroundnew.services.AuthorService;
import com.example.springplaygroundnew.services.BookService;
import com.example.springplaygroundnew.services.ClientService;
import com.example.springplaygroundnew.services.LibraryService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@AllArgsConstructor
public class MyController {
    private SimpleStringRepo simpleStringRepo;
    private AuthorService authorService;
    private BookService bookService;
    private ClientService clientService;
    private LibraryService libraryService;

    @GetMapping
    public List<String> show(){
        return simpleStringRepo.getStrings();
    }

    @GetMapping("/browse")
    public List<BaseEntity> showAll() {
        List<BaseEntity> entities = new ArrayList<>();
        entities.addAll(bookService.findAll());
        entities.addAll(authorService.findAll());
        entities.addAll(clientService.findAll());
        entities.addAll(libraryService.findAll());
        return entities;
    }
}
