package com.invoiceprocessingsystem.backend.model;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Invoice {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int id;

    private String vendor;

    private String product;

    private int amount;

    private Date dateOfCreation;

    private String action;

    public Invoice() {}

    public Invoice(int id, String vendor, String product, int amount, Date dateOfCreation, String action) {
        this.id = id;
        this.vendor = vendor;
        this.product = product;
        this.amount = amount;
        this.dateOfCreation = dateOfCreation;
        this.action = action;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return this.id;
    }

    public void setVendor(String vendor) {
        this.vendor = vendor;
    }

    public String getVendor() {
        return this.vendor;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public String getProduct() {
        return this.product;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getAmount() {
        return this.amount;
    }

    public void setDate(Date dateOfCreation) {
        this.dateOfCreation = dateOfCreation;
    }

    public Date getDate() {
        return this.dateOfCreation;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getAction() {
        return this.action;
    }
}
