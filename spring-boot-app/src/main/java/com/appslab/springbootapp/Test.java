package com.appslab.springbootapp;

import org.springframework.stereotype.Component;

@Component
public class Test {
    EmployeeService b;

    public Test(EmployeeService b) {
        this.b = b;
        b.writeNumber();
    }
}
