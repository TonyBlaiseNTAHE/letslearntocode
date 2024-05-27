/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;

/**
 *
 * @author Mhz
 */
public class Book implements Serializable{
    private String bookId;
    private String author;
    private String title;
    private String genre;
    private String publisher;
    private String userId_fk;
    private static final long serialVersionUID = 1L;

    public Book() {
    }

    public Book(String bookId) {
        this.bookId = bookId;
    }

    public Book(String bookId, String author, String title, String genre, String publisher, String userId_fk) {
        this.bookId = bookId;
        this.author = author;
        this.title = title;
        this.genre = genre;
        this.publisher = publisher;
        this.userId_fk = userId_fk;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String Genre) {
        this.genre = Genre;
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


    public String getUserId_fk() {
        return userId_fk;
    }

    public void setUserId_fk(String userId_fk) {
        this.userId_fk = userId_fk;
    }
    
    
}
