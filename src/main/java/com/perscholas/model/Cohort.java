package com.perscholas.model;

import javax.persistence.*;

@Entity
@Table
public class Cohort {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int cohortid;
    private String name;
    private String major;

    public void Cohort(){

    }

    public Cohort(int cohortid, String name, String major) {
        this.cohortid = cohortid;
        this.name = name;
        this.major = major;
    }

    public int getCohortid() {
        return cohortid;
    }

    public void setCohortid(int cohortid) {
        this.cohortid = cohortid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }
}
