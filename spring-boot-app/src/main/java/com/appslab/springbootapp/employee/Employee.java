package com.appslab.springbootapp.employee;

import javax.persistence.*;

@Entity
public class Employee {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long id;
    private float salary;
    private int bonus;

    public Employee(float salary, int bonus) {
        this.salary = salary;
        this.bonus = bonus;
    }

    @Column
    public float getSalary() {
        return salary;
    }

    @Column
    public int getBonus() {
        return bonus;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }
}
