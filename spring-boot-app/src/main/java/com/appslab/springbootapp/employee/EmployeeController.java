package com.appslab.springbootapp.employee;

import com.appslab.springbootapp.employee.EmployeeService;
import com.appslab.springbootapp.entity.Company;
import com.appslab.springbootapp.model.Worker;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class EmployeeController {
    EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService){
        this.employeeService = employeeService;
    }

    @PostMapping(value = "/requestEmployee")
    public void request(@RequestBody Employee employee) {
        employeeService.saveEmployee(employee);
    }



    //    ArrayList<Worker> list = new ArrayList<>();
//
//    @GetMapping("/hello")
//    public String hello(){
//        return "Hello Spring Boot";
//    }
//    @GetMapping("/getSalary")
//    public float getSalary(){
//        return c.getTotalSalary(list);
//    }
//    @GetMapping("/getBonus")
//    public float getBonus(){
//        return c.getTotalBonus(list);
//    }
//    @GetMapping("/snail")
//    public double snail(@RequestParam double height,@RequestParam double length,@RequestParam double tower) {
//        return height*length*tower;
//    }

}
