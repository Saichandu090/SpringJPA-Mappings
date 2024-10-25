package com.springjpa.manytomany2.service;

import com.springjpa.manytomany2.model.Employee;
import com.springjpa.manytomany2.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class EmployeeService
{
    @Autowired
    private EmployeeRepository employeeRepository;

    public Employee addEmployee(Employee employee)
    {
        return employeeRepository.save(employee);
    }

    public List<Employee> findAllEmployees()
    {
        return employeeRepository.findAll();
    }

    public Employee findById(Long id)
    {
        return employeeRepository.findById(id).orElseThrow(()->new RuntimeException("Not found"));
    }

    public Employee updateEmp(Long id,Employee employee)
    {
        Employee employee1=findById(id);
        employee1.setName(employee.getName());
        employee1.setEmail(employee.getEmail());
        employee1.setRoles(employee.getRoles());
        return employeeRepository.save(employee1);
    }

    public String deleteEmp(Long id)
    {
        Employee employee=findById(id);
        employeeRepository.delete(employee);
        return "Employee with id "+id+" has been deleted from DataBase";
    }
}
