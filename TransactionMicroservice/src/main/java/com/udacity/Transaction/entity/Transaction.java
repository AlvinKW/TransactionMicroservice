package com.udacity.Transaction.entity;

import javax.persistence.*;

@Entity
@Table(name="transactions")
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String transactionDate;
    private double amount;
    private String description;

    public Transaction(Long id, String name, String transactionDate, double amount, String description) {
        this.id = id;
        this.name = name;
        this.transactionDate = transactionDate;
        this.amount = amount;
        this.description = description;
    }

    public Transaction(Long id, String name, String transactionDate, double amount) {
        this.id = id;
        this.name = name;
        this.transactionDate = transactionDate;
        this.amount = amount;
    }

    public Transaction() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(String transactionDate) {
        this.transactionDate = transactionDate;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
