package com.perscholas.model;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table
public class Teacher {

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private int teacherid;
    private String teachername;
    private int age;
    private int salary;

    @ManyToMany(targetEntity = Cohort.class) //if we use this we don't need to use cascade
    private Set CohortSet;

    public void Teacher(){

    }

    public Teacher(int teacherid, String teachername, int age, int salary, Set CohortSet) {
        this.teacherid = teacherid;
        this.teachername = teachername;
        this.age = age;
        this.salary = salary;
        this.CohortSet = CohortSet;
    }

    public int getTeacherid() {
        return teacherid;
    }

    public void setTeacherid(int teacherid) {
        this.teacherid = teacherid;
    }

    public String getTeachername() {
        return teachername;
    }

    public void setTeachername(String teachername) {
        this.teachername = teachername;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Set getCohortSet() {
        return CohortSet;
    }

    public void setCohortSet(Set cohortSet) {
        this.CohortSet = cohortSet;
    }
}
