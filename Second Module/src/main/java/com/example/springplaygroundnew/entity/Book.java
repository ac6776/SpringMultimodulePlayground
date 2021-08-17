package com.example.springplaygroundnew.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
@Data
public class Book extends BaseEntity {
    private String title;

//    @JsonIgnore
    @ManyToOne
    private Author author;

    @ManyToOne
//    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Client client;

    @ManyToOne
//    @ManyToOne(cascade = CascadeType.ALL)
    private Library library;
}
