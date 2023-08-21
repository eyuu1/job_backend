package com.example.BackEnd.campany;

import jakarta.persistence.*;

@Entity
@Table(name = "campany")
public class Campany {

    @Id
    @GeneratedValue(generator="" , strategy = GenerationType.IDENTITY   )
    @SequenceGenerator(name = "campany_gen" , sequenceName = "campany_seq" , initialValue = 1 , allocationSize = 1)
    private Long id;
    @Column(name = "name")
    private String name;
    @Column(name = "email")
    private String email;


    public Campany() {
    }

    public Campany(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public Campany(Long id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
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
}
