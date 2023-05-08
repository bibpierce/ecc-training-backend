package com.example.ecctraining.controller;

import com.example.ecctraining.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;
    @GetMapping("/findAllEmployee")
    public ResponseEntity findAllEmployee(){
        return new ResponseEntity(employeeService.findAllEmployee(), HttpStatus.OK);
    }

}
