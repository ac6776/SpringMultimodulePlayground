package com.example.springplaygroundnew;

import com.example.springplaygroundnew.entity.*;
import com.example.springplaygroundnew.repo.SimpleStringRepo;
import com.example.springplaygroundnew.services.AuthorService;
import com.example.springplaygroundnew.services.BookService;
import com.example.springplaygroundnew.services.ClientService;
import com.example.springplaygroundnew.services.LibraryService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@AllArgsConstructor
public class MyController {
    private SimpleStringRepo simpleStringRepo;
    private AuthorService authorService;
    private BookService bookService;
    private ClientService clientService;
    private LibraryService libraryService;

    @GetMapping
    public List<String> show(){
        return simpleStringRepo.getStrings();
    }

    @GetMapping("/browse")
    public List<BaseEntity> showAll() {
        List<BaseEntity> entities = new ArrayList<>();
        entities.addAll(bookService.findAll());
        entities.addAll(authorService.findAll());
        entities.addAll(clientService.findAll());
        entities.addAll(libraryService.findAll());
        return entities;
    }

    @GetMapping("/authors")
    public List<Author> authors() {
        return authorService.findAll();
    }

    @GetMapping("/authors/{id}")
    public String author(@PathVariable Long id) {
        Author authorFromDb = authorService.findById(id);
        if (authorFromDb == null) {
            return "There is no such Author";
        }
        List<Book> books = authorFromDb.getBooks();
        String booksString = books.stream().map(book -> book.getTitle() + " ").collect(Collectors.joining());
        return authorFromDb.getFirstName() + " "
                + authorFromDb.getLastName() + "\nBooks: {" +
                booksString + "}";
    }

    @GetMapping("/books")
    public List<Book> books() {
        return bookService.findAll();
    }

    @GetMapping("/books/{id}")
    public String book(@PathVariable Long id) {
        Book bookFromDb = bookService.findById(id);
        if (bookFromDb == null) {
            return "There is no such book";
        }
        return bookFromDb.getTitle() + " Author: " + bookFromDb.getAuthor().getFirstName() + " " + bookFromDb.getAuthor().getLastName();
    }

    @GetMapping("/clients")
    public List<Client> clients() {
        return clientService.findAll();
    }

    @GetMapping("/libraries")
    public List<Library> libraries() {
        return libraryService.findAll();
    }
}
