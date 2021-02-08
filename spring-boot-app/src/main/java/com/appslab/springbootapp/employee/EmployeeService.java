package com.appslab.springbootapp.employee;

import com.appslab.springbootapp.model.*;

import java.util.List;

public interface EmployeeService {

    void saveEmployee(Employee employee);

    float getTotalSalary(List<Worker> employees);
    int getTotalBonus(List<Worker> employees);
    void writeNumber();
}