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
    private int subscriptionId;
    private String subscriptionType;
    private Date expirationDate;

    public Subscription() {
    }

    public Subscription(int subscriptionId) {
        this.subscriptionId = subscriptionId;
    }

    public Subscription(int subscriptionId, String subscriptionType) {
        this.subscriptionId = subscriptionId;
        this.subscriptionType = subscriptionType;
    }

    public Subscription(int subscriptionId, String subscriptionType, Date expirationDate) {
        this.subscriptionId = subscriptionId;
        this.subscriptionType = subscriptionType;
        this.expirationDate = expirationDate;
    }

    public int getSubscriptionId() {
        return subscriptionId;
    }

    public void setSubscriptionId(int subscriptionId) {
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
    
}
