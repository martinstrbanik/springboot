package com.appslab.springbootapp;

import com.appslab.springbootapp.model.*;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EmployeeServiceImpl implements EmployeeService {
    int number = 0;
    @Override
    public void writeNumber(){
        number++;
        System.out.println(number);
    }

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