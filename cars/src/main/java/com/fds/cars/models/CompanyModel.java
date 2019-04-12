package com.fds.cars.models;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.annotations.GeneratorType;
import org.springframework.format.annotation.DateTimeFormat;
import com.fds.cars.models.CarModel;

@Entity
@Table(name="company")
public class CompanyModel {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @NotNull
    @Id
    private Long id;

    @Size(min = 1, max=255, message = "Please enter a valid name")
    private String name;

    @Size(min = 1, max=255, message = "Please enter a valid model")
    private String model;

    @Size(min = 1, max=255, message = "Please enter a valid location")
    private String location;

    // @Column(updatable=false)
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
    // fetch=FetchType.LAZY, cascade = CascadeType.ALL, mappedBy="user"
    @OneToMany(mappedBy = "company", fetch=FetchType.LAZY)
    private List<CarModel> car;



    //default constructor
    public CompanyModel(){};

    //setters and getters


    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return this.model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getLocation() {
        return this.location;
    }

    public void setLocation(String location) {
        this.location = location;
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

    public List<CarModel> getCar() {
        return this.car;
    }

    public void setCar(List<CarModel> car) {
        this.car = car;
    }



}