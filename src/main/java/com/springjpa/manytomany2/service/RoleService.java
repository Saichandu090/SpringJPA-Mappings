package com.springjpa.manytomany2.service;

import com.springjpa.manytomany2.model.Role;
import com.springjpa.manytomany2.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleService
{
    @Autowired
    private RoleRepository repository;

    public List<Role> findAllRoles()
    {
        return repository.findAll();
    }

    public List<Role> findByName(String name)
    {
        return repository.findByName(name);
    }
}
