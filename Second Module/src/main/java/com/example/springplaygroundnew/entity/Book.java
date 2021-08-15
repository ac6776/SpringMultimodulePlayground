package com.example.springplaygroundnew.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
@Data
public class Book extends BaseEntity {
    private String title;
    @ManyToOne
    @JoinColumn(name = "author_id", referencedColumnName = "id")
    private Author author;
    @ManyToOne
    //todo check for column name
    private Client client;
    @ManyToOne
    @JoinColumn(name = "library_id", referencedColumnName = "id")
    private Library library;
}
