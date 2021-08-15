package com.example.springplaygroundnew.repo;

import com.example.springplaygroundnew.entity.Library;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LibraryRepo extends JpaRepository<Library, Long> {
}
