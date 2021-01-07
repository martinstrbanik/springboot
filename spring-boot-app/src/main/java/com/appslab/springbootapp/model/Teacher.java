package com.appslab.springbootapp.model;

public class Teacher extends Worker {

    public Teacher() {
        super(Enum.TEACHER);
    }

    public Teacher(float salary, int bonus) {
        super(salary, bonus, Enum.TEACHER);
    }

}
