package com.appslab.springbootapp;

import com.appslab.springbootapp.model.*;

import java.util.List;

public class EmployeeServiceImpl implements EmployeeService {

    @Override
    public float getTotalSalary(List<Worker> employees) {
        return (float) employees.stream()
                .mapToDouble(Worker::getSalary)
                .sum();
    }

    @Override
    public int getTotalBonus(List<Worker> employees) {
        return employees.stream()
                .mapToInt(Worker::getBonus)
                .sum();
    }

}