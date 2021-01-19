package com.appslab.springbootapp.controller;

import com.appslab.springbootapp.service.EmployeeService;
import com.appslab.springbootapp.model.Worker;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class EmployeeController {
    EmployeeService c;
    ArrayList<Worker> list = new ArrayList<>();

    @GetMapping("/hello")
    public String hello(){
        return "Hello Spring Boot";
    }
    @GetMapping("/getSalary")
    public float getSalary(){
        return c.getTotalSalary(list);
    }
    @GetMapping("/getBonus")
    public float getBonus(){
        return c.getTotalBonus(list);
    }
    @GetMapping("/snail")
    public double snail(@RequestParam double height,@RequestParam double length,@RequestParam double tower) {
        return height*length*tower;
    }
    public EmployeeController(EmployeeService c){
        this.c = c;
    }
}
