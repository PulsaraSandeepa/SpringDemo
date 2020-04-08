package com.example.demo;
import java.util.Date;

public class Book {

    private int BookId;
    private String BookName;
    private Date PublishedDate;

    public Book(int bookId, String bookName, Date publishedDate) {
        BookId = bookId;
        BookName = bookName;
        PublishedDate = publishedDate;
    }

    public int getBookId() {
        return BookId;
    }

    public void setBookId(int bookId) {
        BookId = bookId;
    }

    public String getBookName() {
        return BookName;
    }

    public void setBookName(String bookName) {
        BookName = bookName;
    }

    public Date getPublishedDate() {
        return PublishedDate;
    }

    public void setPublishedDate(Date publishedDate) {
        PublishedDate = publishedDate;
    }

    @Override
    public String toString() {
        return "Book{" +
                "BookId=" + BookId +
                ", BookName='" + BookName + '\'' +
                ", PublishedDate=" + PublishedDate +
                '}';
    }
}
