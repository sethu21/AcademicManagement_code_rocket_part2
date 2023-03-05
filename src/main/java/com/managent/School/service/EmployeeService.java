package com.managent.School.service;

import com.managent.School.entity.Employee;

import java.util.List;

public interface EmployeeService {
    Employee saveEmployee(Employee employee);
    List<Employee> getAllEmployees();

    Employee getEmployeeById(long id);

    Employee UpateEmployee(Employee employee,long id);

    void deleteEmployee(long id);
}
