package com.SpringDataJPA.SpringDataJPA.entity;

import com.SpringDataJPA.SpringDataJPA.embedded.Address;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;

//    @Embedded
//    private Address address;

//    @OneToMany(mappedBy = "author", cascade = CascadeType.ALL, orphanRemoval = true)
//    private List<Subjects> Subjects;

//    @OneToOne
//    @JoinColumn(name = "book_id")
//    private Book book;

//    @OneToMany(mappedBy = "author", cascade = CascadeType.ALL)
//    private List<Book> book;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "author_book", joinColumns = @JoinColumn(name = "author_id"), inverseJoinColumns = @JoinColumn(name = "book_id"))
    private List<Book> book = new ArrayList<>();

    public Author() {}

    public Author(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

//    public Address getAddress() {
//        return address;
//    }
//
//    public void setAddress(Address address) {
//        this.address = address;
//    }

//    public List<Subjects> getSubjects() {
//        return Subjects;
//    }
//
//    public void setSubjects(List<Subjects> subjects) {
//        Subjects = subjects;
//    }

//    public Book getBook() {
//        return book;
//    }
//
//    public void setBook(Book book) {
//        this.book = book;
//    }

    public List<Book> getBook() {
        return book;
    }

    public void setBook(List<Book> book) {
        this.book = book;
    }
}
