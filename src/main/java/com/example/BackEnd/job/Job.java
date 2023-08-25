package com.example.BackEnd.job;

import jakarta.persistence.*;
import org.springframework.core.SpringVersion;

@Entity
@Table
public class Job {

    @Id
    @GeneratedValue(generator = "job_gen" , strategy = GenerationType.IDENTITY)
    @SequenceGenerator(name = "job_gen" , sequenceName = "job_seq" , initialValue = 1 , allocationSize = 1)
    private Long id;
    @Column(name = "title")
    private String title;
    @Column(name = "description")
    private String description;
    @Column(name = "location")
    private String location;
//    private String type;


    public Job() {
    }

    public Job(String title, String description, String location) {
        this.title = title;
        this.description = description;
        this.location = location;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
