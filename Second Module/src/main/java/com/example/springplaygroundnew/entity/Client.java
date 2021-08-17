package com.example.springplaygroundnew.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Data
public class Client extends BasePerson {
    @JsonIgnore
    @OneToMany(mappedBy = "client")
    private Set<Book> books;

    @ManyToMany(cascade = CascadeType.MERGE, fetch = FetchType.EAGER)
    @JoinTable(name = "LIBRARY_CLIENT",
            joinColumns = {@JoinColumn(name = "client_id", referencedColumnName = "id")},
            inverseJoinColumns = {@JoinColumn(name = "library_id", referencedColumnName = "id")})
    private Set<Library> libraries = new HashSet<>();

    public void addLibrary(Library library) {
        this.libraries.add(library);
    }
}
