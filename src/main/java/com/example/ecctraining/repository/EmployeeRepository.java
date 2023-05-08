package com.example.ecctraining.repository;

import com.example.ecctraining.model.Employee;
import org.springframework.data.domain.Example;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    @Query(nativeQuery = true, value = "SELECT * FROM employee_data")
    List<Employee> findAll();

}
