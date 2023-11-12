package org.launchcode.techjobs.persistent.models;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Employer extends AbstractEntity {

    @NotBlank(message= "Cannot be blank")
    @Size(max=100, message= "Must be less than 100 characters")
    private String location;

    @OneToMany
    @JoinColumn(name= "employer_id")
    public List<Job> jobs = new ArrayList<>();

    //Created No-Arg Constructor
    public Employer() {
        super();
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
