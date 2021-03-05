package com.appslab.springbootapp.course;

import com.appslab.springbootapp.employee.Employee;

import javax.persistence.*;
import java.util.Calendar;
import java.util.Set;

@Entity
public class Course {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long Id;
    private String title;
    private Calendar startTime;
    private Calendar endTime;

    @ManyToMany(mappedBy = "courses", cascade = CascadeType.ALL)
    Set<Employee> employees;

    public Course(String title, Calendar startTime, Calendar endTime) {
        this.title = title;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    @Column
    public String getTitle() {
        return title;
    }

    @Column
    public Calendar getStartTime() {
        return startTime;
    }

    @Column
    public Calendar getEndTime() {
        return endTime;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setStartTime(Calendar startTime) {
        this.startTime = startTime;
    }

    public void setEndTime(Calendar endTime) {
        this.endTime = endTime;
    }

    public Set<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(Set<Employee> employees) {
        this.employees = employees;
    }
}
