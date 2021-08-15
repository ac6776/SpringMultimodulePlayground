package com.example.springplaygroundnew.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
@Data
public class Author extends BasePerson {
    @JsonIgnore
    @OneToMany
//    @JoinColumn(name = "book_id", referencedColumnName = "id")
    private List<Book> books;
}
