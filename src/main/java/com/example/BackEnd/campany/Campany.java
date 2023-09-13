package com.example.BackEnd.campany;

import jakarta.persistence.*;

@Entity
@Table(name = "campany")
public class Campany {

    @Id
    @GeneratedValue(generator="campany_gen" , strategy = GenerationType.IDENTITY   )
    @SequenceGenerator(name = "campany_gen" , sequenceName = "campany_seq" , initialValue = 1 , allocationSize = 1)
    private Long id;
    @Column(name = "name")
    private String name;
    @Column(name = "email")
    private String email;

    @Column(name = "password")
    private String password;


    public Campany() {
    }

    public Campany(String name, String email , String password) {
        this.name = name;
        this.email = email;
        this.password = password;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() { return password; }

    public void setPassword(String password) {  this.password = password;  }


}
