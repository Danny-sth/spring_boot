package com.dannykudinov.spring.springboot.spring_course_spring_boot.service;

import com.dannykudinov.spring.springboot.spring_course_spring_boot.entity.Employee;

import java.util.List;

public interface EmployeeService {

    public List<Employee> getAllEmployees();

    public void saveEmployee(Employee employee);

    public Employee getEmployee(int id);

    public void deleteEmployee(int id);
}
