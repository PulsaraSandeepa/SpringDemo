package com.example.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookResource {

    @Autowired
    private BookService bookService;

    @GetMapping("/books")
    public List<Book> getAllBooks() {
        return bookService.findAllBooks();
    }

    @GetMapping("/books/{bookId}")
    public Book retrieveBook(@PathVariable int bookId){
        return bookService.findBook(bookId);
    }

    @PostMapping("/books")
    public void createBook(@RequestBody Book book){
        Book addBook =bookService.addBook(book);
    }

}
