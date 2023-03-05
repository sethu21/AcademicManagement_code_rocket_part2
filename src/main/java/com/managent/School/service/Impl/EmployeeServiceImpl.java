package com.managent.School.service.Impl;

import com.managent.School.entity.Employee;
import com.managent.School.exception.ResourceNotFoundException;
import com.managent.School.repository.EmployeeRepository;
import com.managent.School.service.EmployeeService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    private EmployeeRepository employeeRepository;

    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        super();
        this.employeeRepository = employeeRepository;
    }

    @Override
    public Employee saveEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee getEmployeeById(long id) {
        Optional <Employee> employee = employeeRepository.findById(id);
        if(employee.isPresent()){
            return employee.get();
        }else {
            throw new ResourceNotFoundException("Employee","Id",id);
        }
    }

    @Override
    public Employee UpateEmployee(Employee employee, long id) {
        // we need to check whether employee is exist or not
        Employee existingEmployee = employeeRepository.findById(id).orElseThrow(()
        -> new ResourceNotFoundException("Employee","Id",id));


        existingEmployee.setFirstName(employee.getFirstName());
        existingEmployee.setLastName(employee.getLastName());
        existingEmployee.setEmail(employee.getEmail());
        // save existing database
        employeeRepository.save(existingEmployee);
        return existingEmployee;
    }

    @Override
    public void deleteEmployee(long id) {
        //check employee exist or not

        employeeRepository.findById(id).orElseThrow(()
                ->new ResourceNotFoundException("Employee","id",id));


        employeeRepository.deleteById(id);
    }
}
