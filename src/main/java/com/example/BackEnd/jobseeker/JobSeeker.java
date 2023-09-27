package com.example.BackEnd.jobseeker;

import jakarta.persistence.*;

import java.io.File;

@Entity
@Table(name = "jobSeeker")
public class JobSeeker {

    @Id
    @GeneratedValue(generator="jobseeker_gen" , strategy = GenerationType.IDENTITY   )
    @SequenceGenerator(name = "jobseeker_gen" , sequenceName = "jobseeker_seq" , initialValue = 1 , allocationSize = 1)
    private Long id;
    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;
    @Column(name = "email")
    private String email;

    @Column(name = "password")
    private String password;

    @Column(name = "cv")
    private File cv;


    public JobSeeker() {
    }

    public JobSeeker(Long id, String firstName, String lastName, String email, String password, File cv) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.cv = cv;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public File getCv() {
        return cv;
    }

    public void setCv(File cv) {
        this.cv = cv;
    }
}
