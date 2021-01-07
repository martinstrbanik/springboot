package com.appslab.springbootapp.model;

public class Programmer extends Worker {

    public Programmer() {
        super(Enum.PROGRAMMER);
    }

    public Programmer(float salary, int bonus) {
        super(salary, bonus, Enum.PROGRAMMER);
    }

    @Override
    public void getInfo() {
        System.out.println("Programmer salary is " + (salary + bonus));
    }

}




