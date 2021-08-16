package com.example.springplaygroundnew.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Book extends BaseEntity {
    private String title;

//    @JsonIgnore
    @ManyToOne
//    @JoinColumn(name = "author_id", referencedColumnName = "id")
    private Author author;

    @ManyToOne
//    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Client client;

    @ManyToOne
//    @ManyToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name = "library_id", referencedColumnName = "id")
    private Library library;
}
