/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Mhz
 */
public class User {
    private String username;
    private String password;
    private String email;
    private String phone_number;
    private String subscription_status;

    public User() {
    }

    public User(String username, String password, String email, String phone_number, String subscription_status) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.phone_number = phone_number;
        this.subscription_status = subscription_status;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public String getSubscription_status() {
        return subscription_status;
    }

    public void setSubscription_status(String subscription_status) {
        this.subscription_status = subscription_status;
    }
    
    
}
