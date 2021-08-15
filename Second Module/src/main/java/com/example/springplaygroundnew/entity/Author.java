package com.example.springplaygroundnew.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import java.util.Set;

@Entity
@Data
public class Author extends BasePerson {
    @OneToMany
    @JoinColumn(name = "book_id", referencedColumnName = "id")
    private Set<Book> books;
}
