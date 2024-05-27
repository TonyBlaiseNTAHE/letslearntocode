/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author Mhz
 */
public class Rental  implements Serializable{
    private int id;
    private Book book;
    private User User;
    private String status; 
    private String rentalDate;
    private String returnDate;
    private static final long serialVersionUID = -4905888954825870562L;

    public Rental() {
    }

    
    public Rental(int id) {
        this.id = id;
    }

    public Rental(int id, Book book, User User, String status, String rentalDate, String returnDate) {
        this.id = id;
        this.book = book;
        this.User = User;
        this.status = status;
        this.rentalDate = rentalDate;
        this.returnDate = returnDate;
    }

    

    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public User getUser() {
        return User;
    }

    public void setUser(User User) {
        this.User = User;
    }

    public String getRentalDate() {
        return rentalDate;
    }

    public void setRentalDate(String rentalDate) {
        this.rentalDate = rentalDate;
    }

    public String getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(String returnDate) {
        this.returnDate = returnDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
}
