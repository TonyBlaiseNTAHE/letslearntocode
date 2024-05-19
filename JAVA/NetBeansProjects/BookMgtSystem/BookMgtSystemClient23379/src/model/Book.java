/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;

/**
 *
 * @author Mhz
 */
public class Book {
    private String title;
    private String author;
    private String ISBN;
    private Date publication_date;
    private String availability_status;

    public Book() {
    }

    public Book(String ISBN) {
        this.ISBN = ISBN;
    }

    public Book(String title, String author, String ISBN, Date publication_date, String availability_status) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.publication_date = publication_date;
        this.availability_status = availability_status;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public Date getPublication_date() {
        return publication_date;
    }

    public void setPublication_date(Date publication_date) {
        this.publication_date = publication_date;
    }

    public String getAvailability_status() {
        return availability_status;
    }

    public void setAvailability_status(String availability_status) {
        this.availability_status = availability_status;
    }
    
    
    
}
