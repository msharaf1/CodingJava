package com.product.product.models;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.Email;
import javax.validation.constraints.Size;
import javax.persistence.JoinColumn;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="user")
public class User {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="user_id")
	private Long id;
	
	@Size(min=2,max=255,message="Name must be between 2-255 characters.")
	private String firstName;
	@Size(min=2,max=255,message="Name must be between 2-255 characters.")
    private String lastName;
    private String middleName;
    @DateTimeFormat(pattern="MM-dd-yyyy")
    private Date dateOfBirth;
    
    @Email
	@Size(min=2,max=255,message="Name must be between 2-255 characters.")
	private String email;
	@Size(min=8,max=64,message="Password much be between 8-64 characters.")
	private String password;
	@Transient
	@Size(min=8,max=64,message="Password much be between 8-64 characters.")
	private String confirm;
	
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
	
	// @OneToMany(mappedBy="creator", fetch = FetchType.LAZY)
	// private List<Idea> ideas;
    
	// @ManyToMany(fetch = FetchType.LAZY)
	// @JoinTable(
    //     name = "users_lawyers",
	// 	joinColumns = @JoinColumn(name = "user_id"),
	// 	inverseJoinColumns = @JoinColumn(name = "lawyer_id")
	// 	)
	// 	private List<Lawyer> liked_ideas;
        
    public User() {}

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMiddleName() {
        return this.middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public Date getDateOfBirth() {
        return this.dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getConfirm() {
        return this.confirm;
    }

    public void setConfirm(String confirm) {
        this.confirm = confirm;
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
        

}//class brackets
