package com.example.BackEnd.job;

import com.example.BackEnd.jobCategory.JobCategory;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;



//@Data
//@Getter
@Getter
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

    @Column(name = "status" , columnDefinition = "varchar(255) default 'pending'")
    private String status;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "category_id" , referencedColumnName = "id")
    private JobCategory category;



    public Job() {
    }

    public Job(String title, String description, String location , String jobType , String url, JobCategory category) {
        this.title = title;
        this.description = description;
        this.location = location;
        this.jobType = jobType;
        this.url = url;
        this.category=category;
    }

    public Job(String title, String description, String location , String jobType , String url , String status) {
        this.title = title;
        this.description = description;
        this.location = location;
        this.jobType = jobType;
        this.url = url;
        this.status = status;
    }


    public void setId(Long id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setJobType(String jobType) {  this.jobType = jobType;  }

    public void setUrl(String url) {   this.url = url;  }

    public void setStatus(String status) {  this.status = status;   }



    public JobCategory getJobCategory() {
        return category;
    }

    public void setJobCategory(JobCategory category) {
        this.category = category;
    }
}
