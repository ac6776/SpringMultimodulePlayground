package com.example.springplaygroundnew.util;

import com.example.springplaygroundnew.entity.Author;
import com.example.springplaygroundnew.entity.Book;
import com.example.springplaygroundnew.entity.Client;
import com.example.springplaygroundnew.entity.Library;
import com.example.springplaygroundnew.services.AuthorService;
import com.example.springplaygroundnew.services.BookService;
import com.example.springplaygroundnew.services.ClientService;
import com.example.springplaygroundnew.services.LibraryService;
import lombok.AllArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Set;

@Component
@AllArgsConstructor
public class Bootstrap implements CommandLineRunner {
    //services
    private AuthorService authorService;
    private BookService bookService;
    private ClientService clientService;
    private LibraryService libraryService;

    @Override
    public void run(String... args) throws Exception {
        //Libraries
        Library lib1 = new Library();
        lib1.setTitle("The Central Library");

        Library lib2 = new Library();
        lib2.setTitle("The Second Library");

        //Authors
        Author pushkin = new Author();
        pushkin.setFirstName("Alexandr");
        pushkin.setLastName("Pushkin");

        Author gogol = new Author();
        gogol.setFirstName("Nikolay");
        gogol.setLastName("Gogol");

        Author tolstoy = new Author();
        tolstoy.setFirstName("Lev");
        tolstoy.setLastName("Tolstoy");

        Author dumas = new Author();
        dumas.setFirstName("Alexandre");
        dumas.setLastName("Dumas");

        //Clients
        Client client1 = new Client();
        client1.setFirstName("John");
        client1.setLastName("Smith");

        Client client2 = new Client();
        client2.setFirstName("Ivan");
        client2.setLastName("Ivanov");

        Client client3 = new Client();
        client3.setFirstName("Natalya");
        client3.setLastName("Oreiro");

        //Books
        Book book1 = new Book();
        book1.setTitle("Evgeniy Onegin");
        book1.setAuthor(pushkin);
        book1.setLibrary(lib1);
        book1.setClient(client1);

        Book book2 = new Book();
        book2.setTitle("Lukomorye");
        book2.setAuthor(pushkin);
        book2.setLibrary(lib2);

        Book book3 = new Book();
        book3.setTitle("Dead souls");
        book3.setAuthor(gogol);
        book3.setLibrary(lib1);
        book3.setClient(client2);

        Book book4 = new Book();
        book4.setTitle("Peace and war");
        book4.setAuthor(tolstoy);
        book4.setLibrary(lib2);

        Book book5 = new Book();
        book5.setTitle("Anna Karenina");
        book5.setAuthor(tolstoy);
        book5.setLibrary(lib2);
        book5.setClient(client3);

        Book book6 = new Book();
        book6.setTitle("Le Comte de Monte-Cristo");
        book6.setAuthor(dumas);
        book6.setLibrary(lib1);

        Book book7 = new Book();
        book7.setTitle("Les trois mousquetaires");
        book7.setAuthor(dumas);
        book7.setLibrary(lib2);

        client1.setLibraries(Set.of(lib1, lib2));
        client2.setLibraries(Set.of(lib1));
        client3.setLibraries(Set.of(lib2));

        //todo author.setBooks()
        //todo library.setBooks()
        //todo library.setClients()
    }
}
