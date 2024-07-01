package com.example.Personal_Finance_Management_System.entity;


import jakarta.persistence.*;

import java.util.Date;

@Entity(name = "transactions")
public class Transaction {

    @Id
    @Column(name = "transaction_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @Column(name = "amount")
    private double amount;

    @Column(name = "transaction_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date date;

    @Column(name = "transaction_type")
    private String type;

    public Transaction() {

    }

    public Transaction(int id, User user, double amount, Date date, String type) {
        this.id = id;
        this.user = user;
        this.amount = amount;
        this.date = date;
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

}
