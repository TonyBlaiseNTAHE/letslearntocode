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
public class Subscription {
    private String subscriptionId;
    private String subscriptionType;
    private Date expirationDate;
    private String userId_fk;

    public Subscription() {
    }

    public Subscription(String subscriptionId) {
        this.subscriptionId = subscriptionId;
    }

    public String getSubscriptionId() {
        return subscriptionId;
    }

    public void setSubscriptionId(String subscriptionId) {
        this.subscriptionId = subscriptionId;
    }

    public String getSubscriptionType() {
        return subscriptionType;
    }

    public void setSubscriptionType(String subscriptionType) {
        this.subscriptionType = subscriptionType;
    }

    public Date getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }

    public String getUserId_fk() {
        return userId_fk;
    }

    public void setUserId_fk(String userId_fk) {
        this.userId_fk = userId_fk;
    }
    
    
    
    
}
