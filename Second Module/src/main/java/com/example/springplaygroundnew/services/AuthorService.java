package com.example.springplaygroundnew.services;

import com.example.springplaygroundnew.entity.Author;
import com.example.springplaygroundnew.repo.AuthorRepo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class AuthorService implements BaseService<Author> {
    private AuthorRepo repo;

    @Override
    public Author save(Author entity) {
        return repo.save(entity);
    }

    @Override
    public Author findById(Long id) {
        return repo.findById(id).orElse(null);
    }

    @Override
    public List<Author> findAll() {
        return (List<Author>) repo.findAll();
    }
}
