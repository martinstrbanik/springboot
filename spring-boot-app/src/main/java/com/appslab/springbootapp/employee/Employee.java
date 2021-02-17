package com.appslab.springbootapp.employee;

import javax.persistence.*;

@Entity
public class Employee {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long id;
    private float salary;
    private int bonus;
    private String employment;

    public Employee(float salary, int bonus, String employment) {
        this.salary = salary;
        this.bonus = bonus;
        this.employment = employment;
    }

    @Column
    public float getSalary() {
        return salary;
    }

    @Column
    public int getBonus() {
        return bonus;
    }

    @Column
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
}
