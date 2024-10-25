package com.springjpa.manytomany2.repository;

import com.springjpa.manytomany2.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Long>
{

}
