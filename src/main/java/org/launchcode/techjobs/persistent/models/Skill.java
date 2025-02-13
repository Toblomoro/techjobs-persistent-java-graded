package org.launchcode.techjobs.persistent.models;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Skill extends AbstractEntity {

    public  String description;

    @ManyToMany(mappedBy="skills")
    private List<Job> jobs = new ArrayList<>();

    public Skill() {
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Job>  getJobs() {
        return jobs;
    }

    public void setJob(List<Job> jobs) {
        this.jobs = jobs;
    }
}