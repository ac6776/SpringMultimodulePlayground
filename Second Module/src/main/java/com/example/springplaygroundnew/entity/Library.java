package com.example.springplaygroundnew.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import java.util.Set;

@Entity
@Data
public class Library extends BaseEntity {
    private String title;
    @ManyToMany(mappedBy = "libraries")
    private Set<Client> clients;
    @OneToMany(fetch = FetchType.EAGER)
    private Set<Book> books;
}
