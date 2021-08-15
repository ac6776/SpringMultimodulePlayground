package com.example.springplaygroundnew.services;

import com.example.springplaygroundnew.entity.Library;
import com.example.springplaygroundnew.repo.LibraryRepo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class LibraryService implements BaseService<Library> {
    private LibraryRepo repo;

    @Override
    public Library save(Library entity) {
        return repo.save(entity);
    }

    @Override
    public Library findById(Long id) {
        return repo.findById(id).orElse(null);
    }

    @Override
    public List<Library> findAll() {
        return repo.findAll();
    }
}
