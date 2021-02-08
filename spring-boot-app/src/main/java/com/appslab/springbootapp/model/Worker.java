package com.appslab.springbootapp.model;




public class Worker {
    float salary;
    int bonus;
    protected final Enum worker;

    public Worker(Enum worker) {
        this.worker = worker;
    }

    public Worker(float salary, int bonus, Enum worker) {
        this.salary = salary;
        this.bonus = bonus;
        this.worker = worker;
    }

    public void getInfo() {
        System.out.println(worker.getName() + " salary is " + salary + " ,bonus is " + bonus);
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    public Enum getType() {
        return worker;
    }
}
