package com.SpringDataJPA.SpringDataJPA.service;

import com.SpringDataJPA.SpringDataJPA.entity.Author;
import com.SpringDataJPA.SpringDataJPA.entity.Book;
import com.SpringDataJPA.SpringDataJPA.entity.Subjects;
import com.SpringDataJPA.SpringDataJPA.repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorService {

    @Autowired
    private AuthorRepository authorRepository;

//    public void setAuthorSubjects() {
//        Author author1 = new Author();
//        author1.setName("Abhinav");
//
//        Author author2 = new Author();
//        author2.setName("Dwivedi");
//
//        List<Subjects> subjectsList1 = List.of(
//                new Subjects("Physics", author1),
//                new Subjects("Chemistry", author1),
//                new Subjects("Maths", author1)
//        );
//
//        List<Subjects> subjectsList2 = List.of(
//                new Subjects("Biology", author2),
//                new Subjects("Chemistry", author2),
//                new Subjects("Maths", author2)
//        );
//
//        author1.setSubjects(subjectsList1);
//        author2.setSubjects(subjectsList2);
//
//        authorRepository.saveAll(List.of(author1, author2));
//    }

    public void setAuthorBooks() {
        Author author1 = new Author();
        author1.setName("Abhinav");

        Author author2 = new Author();
        author2.setName("Dwivedi");

//        List<Book> book1 = List.of(
//                new Book("HarryPorter", author1),
//                new Book("JungleSafari", author1)
//        );
//
//        List<Book> book2 = List.of(
//                new Book("GOT", author2),
//                new Book("2States", author2)
//        );

//        author1.setBook(book1);
//        author2.setBook(book2);

        Book book1 = new Book();
        book1.setBookName("HarryPorter");

        Book book2 = new Book();
        book2.setBookName("JungleSafari");

        author1.getBook().add(book1);
        author2.getBook().add(book2);

        book1.getAuthor().add(author1);
        book2.getAuthor().add(author2);

        authorRepository.saveAll(List.of(author1, author2));
    }

}
