package com.example.springplaygroundnew.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Entity
@Data
public class Client extends BasePerson {
    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinTable(name = "LIBRARY_CLIENT",
            joinColumns = {@JoinColumn(name = "library_id", referencedColumnName = "id")},
            inverseJoinColumns = {@JoinColumn(name = "client_id", referencedColumnName = "id")})
    private Set<Library> libraries;
    @OneToMany(fetch = FetchType.EAGER)
    private Set<Book> books;
}
