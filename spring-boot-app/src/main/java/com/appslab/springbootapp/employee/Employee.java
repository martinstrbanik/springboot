package com.appslab.springbootapp.employee;

import com.appslab.springbootapp.course.Course;
import com.appslab.springbootapp.entity.Company;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Employee {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long id;
    private float salary;
    private int bonus;
    private String employment;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="company_id", nullable=false, insertable = false, updatable = false)
    private Company company;

    @Column(name = "company_id")
    private Long companyId;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name = "employee_courses",
            joinColumns = @JoinColumn(name = "employee_id"),
            inverseJoinColumns = @JoinColumn(name = "course_id"))
    Set<Course> courses;

    public Employee(float salary, int bonus, String employment, Long companyId) {
        this.salary = salary;
        this.bonus = bonus;
        this.employment = employment;
        this.companyId= companyId;
    }

    public float getSalary() {
        return salary;
    }

    public int getBonus() {
        return bonus;
    }

    public String getEmployment() {
        return employment;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    public void setEmployment(String employment) {
        this.employment = employment;
    }

    public Set<Course> getCourses() {
        return courses;
    }

    public void setCourses(Set<Course> courses) {
        this.courses = courses;
    }
}
