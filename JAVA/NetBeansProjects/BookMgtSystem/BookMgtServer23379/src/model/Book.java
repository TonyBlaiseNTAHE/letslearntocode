/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import javax.persistence.*;

/**
 *
 * @author Mhz
 */
@Entity
@Table(name="books")
public class Book implements Serializable{
    @Id
    private String bookId;
    private String author;
    private String title;
    private String genre;
    private String publisher;
    @ManyToOne
    @JoinColumn(name = "userId_fk")
    private User user;
    private static final long serialVersionUID = 1L;

    public Book() {
    }

    public Book(String bookId) {
        this.bookId = bookId;
    }

    public Book(String bookId, String author, String title, String genre, String publisher, User user) {
        this.bookId = bookId;
        this.author = author;
        this.title = title;
        this.genre = genre;
        this.publisher = publisher;
        this.user = user;
    }

    

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    
    
    
    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
    

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
    
    
    
}
