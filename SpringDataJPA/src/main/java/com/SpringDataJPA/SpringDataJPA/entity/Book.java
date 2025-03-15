package com.SpringDataJPA.SpringDataJPA.entity;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String bookName;

//    @OneToOne(mappedBy = "book")
//    private Author author;

//    @ManyToOne
//    @JoinColumn(name = "author_id")
//    private Author author;

    @ManyToMany(mappedBy = "book")
    private List<Author> author = new ArrayList<>();

    public Book() {
    }

//    public Book(String bookName, Author author) {
//        this.bookName = bookName;
//        this.author = author;
//    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

//    public Author getAuthor() {
//        return author;
//    }
//
//    public void setAuthor(Author author) {
//        this.author = author;
//    }

    public List<Author> getAuthor() {
        return author;
    }

    public void setAuthor(List<Author> author) {
        this.author = author;
    }
}
