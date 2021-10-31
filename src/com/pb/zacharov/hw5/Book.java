package com.pb.zacharov.hw5;

public class Book {
    String bookName;
    String authorBook;
    String year;

    public Book() {
    }

    public Book(String bookName, String authorBook, String year) {
        this.bookName = bookName;
        this.authorBook = authorBook;
        this.year = year;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthorBook() {
        return authorBook;
    }

    public void setAuthorBook(String authorBook) {
        this.authorBook = authorBook;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookName='" + bookName + '\'' +
                ", authorBook='" + authorBook + '\'' +
                ", year='" + year + '\'' +
                '}';
    }
}
