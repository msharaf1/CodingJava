package com.fds.cars.models;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;


@Entity
@Table(name="car")
public class CarModel {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @NotNull
    @Id
    private Long id;

    @Size(min = 1, max=255, message = "Please enter a valid name")
    private String model;

    @Size(min = 1, max=255, message = "Please enter a valid name")
    private String color;

    @Size(min = 1, max=255, message = "Please enter a valid name")
    private String brand;

    @Column(updatable=false)
    @DateTimeFormat(pattern="MM-dd-yyyy")
    private Date createdAt;
    
    @DateTimeFormat(pattern="MM-dd-yyyy")
    private Date updatedAt;
    
    @PrePersist
    protected void onCreate(){
        this.createdAt = new Date();
    }
    @PreUpdate
    protected void onUpdate(){
        this.updatedAt = new Date();
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "company_id")
    public CompanyModel company;

    //default constructor
    public CarModel(){};


    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getModel() {
        return this.model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBrand() {
        return this.brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Date getCreatedAt() {
        return this.createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return this.updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public CompanyModel getCompany() {
        return this.company;
    }

    public void setCompany(CompanyModel company) {
        this.company = company;
    }



}