package com.example.springplaygroundnew.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import java.util.Set;

@Entity
@Data
public class Library extends BaseEntity {
    private String title;

    @JsonIgnore
    @ManyToMany(mappedBy = "libraries")
    private Set<Client> clients;

    @JsonIgnore
    @OneToMany(mappedBy = "library")
    private Set<Book> books;
}
