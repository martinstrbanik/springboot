package com.appslab.springbootapp.component;

import com.appslab.springbootapp.service.EmployeeService;
import org.springframework.stereotype.Component;

@Component
public class Test {
    EmployeeService b;

    public Test(EmployeeService b) {
        this.b = b;
        b.writeNumber();
    }
}
