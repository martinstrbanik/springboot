package com.appslab.springbootapp.component;

import com.appslab.springbootapp.model.Worker;
import com.appslab.springbootapp.service.EmployeeService;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
@Component
public class DependencyInjectionDemo {
    EmployeeService a;
    float getSum(){
        ArrayList<Worker> sum = new ArrayList<>();
        return a.getTotalBonus(sum)+a.getTotalSalary(sum);
    }

    public DependencyInjectionDemo(EmployeeService a) {
        this.a = a;
        System.out.println(getSum());
        a.writeNumber();
    }
}
