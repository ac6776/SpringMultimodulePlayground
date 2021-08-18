package com.example.springplaygroundnew.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
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
