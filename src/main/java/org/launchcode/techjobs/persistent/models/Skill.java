package org.launchcode.techjobs.persistent.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Skill extends AbstractEntity {

    @NotBlank(message= "Description Cannot Be Blank")
    @Size(max= 500, message= " Description must be less than 500 characters")
    private String description;

    @ManyToMany(mappedBy="skills")
    private List<Job> jobs = new ArrayList<>();

    //Created No Arg constructor
    public Skill() {
        super();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) { this.description = description; }

    public List<Job> getJobs() {
        return jobs;
    }

    public void setJobs(List<Job> jobs) {
        this.jobs = jobs;
    }
}
