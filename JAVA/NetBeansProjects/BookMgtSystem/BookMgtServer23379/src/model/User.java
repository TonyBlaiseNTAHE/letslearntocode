/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.*;

/**
 *
 * @author Mhz
 */
@Entity
@Table(name="users")
public class User implements Serializable{
    @Id
    private String userId;
    @Column(name="full_names")
    private String fullnames;
    private String email;
    private String password;
    private String phone_number;
    @OneToMany(mappedBy= "user")
    private List<Book> books;
    @OneToMany(mappedBy = "user")
    private List<Subscription> subscriptions;
    private boolean subscription_status;
    private static final long serialVersionUID = -6314387467221068400L;
   
    
    // constructers

    public User() {
    }

    public User(String userId) {
        this.userId = userId;
    }

    public User(String userId, String fullnames, String email, String password, String phone_number, List<Book> books, List<Subscription> subscriptions, boolean subscription_status) {
        this.userId = userId;
        this.fullnames = fullnames;
        this.email = email;
        this.password = password;
        this.phone_number = phone_number;
        this.books = books;
        this.subscriptions = subscriptions;
        this.subscription_status = subscription_status;
    }

    
    public List<Subscription> getSubscriptions() {
        return subscriptions;
    }

    public void setSubscriptions(List<Subscription> subscriptions) {
        this.subscriptions = subscriptions;
    }

    

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    

    public String getFullnames() {
        return fullnames;
    }

    public void setFullnames(String fullnames) {
        this.fullnames = fullnames;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isSubscription_status() {
        return subscription_status;
    }

    public void setSubscription_status(boolean subscription_status) {
        this.subscription_status = subscription_status;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }
    
    
}
