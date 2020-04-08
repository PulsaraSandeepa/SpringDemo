package com.example.demo;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Component
public class BookService {

    private static List<Book> books=new ArrayList<>();
    private static int bookCount=3;

    static {
        books.add(new Book(1, "Harry Potter", new Date()));
        books.add(new Book(2, "Game of Thrones", new Date()));
        books.add(new Book(3, "Village in the jungle", new Date()));

    }
    public List<Book>findAllBooks(){
        return books;
    }
    public Book addBook(Book book){

        if(book.getBookId() == 0){
         book.setBookId(bookCount++);
        }
        books.add(book);
        return book;
    }

    public Book findBook(int id){

        for(Book book :books){
            if(book.getBookId()==id){
                return book;
            }

        }
        return null;
    }


}
