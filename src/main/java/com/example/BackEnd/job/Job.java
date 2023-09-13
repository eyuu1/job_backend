package com.example.BackEnd.job;

import jakarta.persistence.*;
import org.springframework.core.SpringVersion;

import java.net.URL;

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

    @Column(name = "jobType")
    private String jobType;

    @Column(name = "url")
    private String url;



    public Job() {
    }

    public Job(String title, String description, String location , String jobType , String url) {
        this.title = title;
        this.description = description;
        this.location = location;
        this.jobType = jobType;
        this.url = url;
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

    public String getJobType() {  return jobType; }

    public void setJobType(String jobType) {  this.jobType = jobType;  }

    public String getUrl() {  return url;  }

    public void setUrl(String url) {   this.url = url;  }
}
