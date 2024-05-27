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
public class User implements Serializable{
    private String userId;
    private String fullnames;
    private String phone_number;
    private String email;
    private String password;
    private boolean subscription_status;
    
    private static final long serialVersionUID = -6314387467221068400L;

    public User() {
    }

    public User(String userId) {
        this.userId = userId;
    }

    public User(String userId, String fullnames, String phone_number, String email, String password, boolean subscription_status) {
        this.userId = userId;
        this.fullnames = fullnames;
        this.phone_number = phone_number;
        this.email = email;
        this.password = password;
        this.subscription_status = subscription_status;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
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
    
}
