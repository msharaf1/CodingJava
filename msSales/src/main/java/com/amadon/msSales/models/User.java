package com.amadon.msSales.models;


import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.Size;
import java.util.Date;

@Entity
@Table(name="users")
public class User {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Size(min=2, max=255, message="Please enter a valid name")
    private String firstName;

    @Size(min=2, max=255, message="Please enter a valid name")
    private String lastName;

    @Email
    private String email;


    @Size(min=8, max = 255, message="Password Must be between 2 and 255")
    private String password;

    @Transient
    @Size(min=8, max = 255, message="Password Confirmation must be between 2 and 255")
    private String confirm;



    private Date createAt;
    private Date updatedAt;

    @PrePersist
    public void onCreate(){
        createAt = new Date();
    }
    @PreUpdate
    public void onUpdate(){
        updatedAt = new Date();
    }


    //emptyConstructor

    public User(){

    }//constructor


    //setters and getters


    public Long getId() {
        return id;
    }

    public String getFirstName() {
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

    public String getConfirm() {
        return confirm;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    //setters


    public void setId(Long id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setConfirm(String confirm) {
        confirm = confirm;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }
}//class closing
