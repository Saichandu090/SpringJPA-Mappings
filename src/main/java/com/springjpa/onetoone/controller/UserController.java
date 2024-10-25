package com.springjpa.onetoone.controller;

import com.springjpa.onetoone.model.Address;
import com.springjpa.onetoone.model.User;
import com.springjpa.onetoone.service.AddressService;
import com.springjpa.onetoone.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController
{
    @Autowired
    private UserService userService;

    @Autowired
    private AddressService addressService;

    @PostMapping("/addUser")
    public User addUser(@RequestBody User user)
    {
        return userService.addUser(user);
    }

    @GetMapping("/allUsers")
    public List<User> getAllUsers()
    {
        return userService.getAllUsers();
    }

    @GetMapping("/byId/{id}")
    public User findById(@PathVariable Long id)
    {
        return userService.findById(id);
    }

    @PutMapping("/updateUser/{id}")
    public User updateUser(@PathVariable Long id,@RequestBody User user)
    {
        return userService.updateUser(id,user);
    }

    @DeleteMapping("/deleteUser/{id}")
    public String deleteUser(@PathVariable Long id)
    {
        return userService.deleteUser(id);
    }

    @GetMapping("/allAddress")
    public List<Address> getAllAddress()
    {
        return addressService.getAll();
    }
}
