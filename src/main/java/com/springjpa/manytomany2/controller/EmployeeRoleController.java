package com.springjpa.manytomany2.controller;

import com.springjpa.manytomany2.model.Employee;
import com.springjpa.manytomany2.model.Role;
import com.springjpa.manytomany2.service.EmployeeService;
import com.springjpa.manytomany2.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeRoleController
{
    @Autowired
    private EmployeeService employeeService;

    @Autowired
    private RoleService roleService;

    @PostMapping("/add")
    public Employee addEmployee(@RequestBody Employee employee)
    {
        return employeeService.addEmployee(employee);
    }

    @GetMapping("/allEmployees")
    public List<Employee> getAllEmp()
    {
        return employeeService.findAllEmployees();
    }

    @GetMapping("/byId/{id}")
    public Employee findById(@PathVariable Long id)
    {
        return employeeService.findById(id);
    }

    @PutMapping("/updateEmp/{id}")
    public Employee updateEmp(@PathVariable Long id,@RequestBody Employee employee)
    {
        return employeeService.updateEmp(id,employee);
    }

    @DeleteMapping("/deleteEmp/{id}")
    public String deleteEmp(@PathVariable Long id)
    {
        return employeeService.deleteEmp(id);
    }

    @GetMapping("/getAllRoles")
    public List<Role> findAllRoles()
    {
        return roleService.findAllRoles();
    }

    @GetMapping("/byRoleName/{name}")
    public List<Role> byName(@PathVariable String name)
    {
        return roleService.findByName(name);
    }
}
