package com.isc.isc.models;

import java.util.Date;

import javax.persistence.Column;
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

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="lawyer")
public class Lawyer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="lawyer_id")
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

    public Lawyer(){}
}