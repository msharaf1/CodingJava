package com.fredericksburg.city.models;

// import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.Email;
import javax.validation.constraints.Size;
import java.util.Date;

@Entity
@Table(name="users")

public class User {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;

    @Size(min=2, max=255, message="First name must be between 2 and 255 charachters")
    private String firstName;

    @Size(min=2, max=255, message="Last name must be between 2 and 255 charachters")
    private String lastName;

    @Email
    private String email;

    @Size(min=8, max=255, message="Must enter minimum of 8 charachters")
    private String password;

    @Transient
    @Size(min=2, max=255, message="Password must match.")
    private String confirmPassword;

    private Date createdAt;
    private Date updatedAt;

    @PrePersist
    public void onCreate(){
        createdAt = new Date();
    }
    @PreUpdate
    public void onUpdate(){
        updatedAt = new Date();
    }

    public User(){

    }//empty constructor.

    //Setters and Getters

    public Long getId(){
        return id;
    }
    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public String getEmail(){
        return email;
    }
    public String getPassword(){
        return password;
    }
    public String getConfirmPassword(){
        return confirmPassword;
    }

    public Date getCreateAt(){
        return createdAt;
    }
    public Date getUpdateAt(){
        return updatedAt;
    }
    //Setters
    public void setId(Long id){
        this.id = id;
    }
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public void setPassword(String password){
        this.password = password;
    }
    public void setConfirmPassword(String confirmPassword){
        this.confirmPassword = confirmPassword;
    }

    public void setCeatedAt(Date createdAt){
        this.createdAt = new Date();
    }
    public void setUpDateAT(Date updatedAt){
        this.updatedAt = new Date();
    }


}