package com.example.springplaygroundnew;

import com.example.springplaygroundnew.entity.Book;
import com.example.springplaygroundnew.repo.BookRepo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class BookRepoTest {

    @Autowired
    private BookRepo bookRepo;

    @Test
    public void saveNewBook() {
        Book book = new Book().builder()
                .title("New book")
                .build();
        Book bookFromDB = bookRepo.save(book);
        System.out.println("bookFromDB = " + bookFromDB);
        assertNotNull(bookFromDB);
    }
}
