package com.appslab.springbootapp.employee;

import com.appslab.springbootapp.model.*;
import com.appslab.springbootapp.employee.EmployeeService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EmployeeServiceImpl implements EmployeeService {

    EmployeeRepository employeeRepository;

    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public void saveEmployee(Employee employee) {
        employeeRepository.save(employee);
    }


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