package com.zaurtregulov.spring.springboot.demo_for_github.dao;

import com.zaurtregulov.spring.springboot.demo_for_github.Entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
    public List<Employee> findAllByName(String name);
}
