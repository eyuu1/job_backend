package com.example.BackEnd.jobCategory;

import com.example.BackEnd.job.Job;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;



import java.util.List;

//@Data
//@Getter
@Entity
@Table(name = "jobCategory")
public class JobCategory {


    @Id
    @GeneratedValue(generator="category_gen" , strategy = GenerationType.IDENTITY   )
    @SequenceGenerator(name = "category_gen" , sequenceName = "category_seq" , initialValue = 1 , allocationSize = 1)
    private Long id;
    @Column(name = "name")
    private String name;


//    @JsonIgnore
    @OneToMany(mappedBy = "category" , cascade = CascadeType.ALL , fetch = FetchType.LAZY)
    private List<Job> jobs;

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setJobs(List<Job> jobs) {
        this.jobs = jobs;
    }


    public JobCategory() {
    }
    public JobCategory(Long id, String name) {
        this.id = id;
        this.name = name;
    }
}
