package com.appslab.springbootapp.service;

import com.appslab.springbootapp.model.*;

import java.util.List;

public interface EmployeeService {

    float getTotalSalary(List<Worker> employees);
    int getTotalBonus(List<Worker> employees);
    void writeNumber();
}