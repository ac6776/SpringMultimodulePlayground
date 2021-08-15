package com.example.springplaygroundnew.services;

import com.example.springplaygroundnew.entity.Book;
import com.example.springplaygroundnew.repo.BookRepo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class BookService implements BaseService<Book> {
    private BookRepo repo;

    @Override
    public Book save(Book entity) {
        return repo.save(entity);
    }

    @Override
    public Book findById(Long id) {
        return repo.findById(id).orElse(null);
    }

    @Override
    public List<Book> findAll() {
        return (List<Book>) repo.findAll();
    }
}
