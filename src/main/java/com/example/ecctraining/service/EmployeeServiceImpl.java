package com.example.ecctraining.service;

import com.example.ecctraining.model.Employee;
import com.example.ecctraining.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class EmployeeServiceImpl implements EmployeeService{

    @Autowired
    EmployeeRepository employeeRepository;


    @Override
    public List<Employee> findAllEmployee(){
        return employeeRepository.findAll();
    }
}
