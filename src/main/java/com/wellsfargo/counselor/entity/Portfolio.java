package com.wellsfargo.counselor.entity;

import java.util.Date;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Portfolio {
    @Id
    @GeneratedValue()
    private long portfolioId;

    @ManyToOne
    @JoinColumn(nullable = false)
    private Client clientId;

    @Column(nullable = false)
    @CreationTimestamp
    private Date creationDate;

    protected Portfolio(){

    }

    public long getPortfolioId() {
        return portfolioId;
    }
    
    public Client getClientId() {
        return clientId;
    }

    public Date getCreationDate() {
        return creationDate;
    }

}
