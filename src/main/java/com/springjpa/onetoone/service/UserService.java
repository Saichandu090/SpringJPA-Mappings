package com.springjpa.onetoone.service;

import com.springjpa.onetoone.model.User;
import com.springjpa.onetoone.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService
{
    @Autowired
    private UserRepository userRepository;

    public User addUser(User user)
    {
        return userRepository.save(user);
    }

    public List<User> getAllUsers()
    {
        return userRepository.findAll();
    }

    public User findById(Long id)
    {
        return userRepository.findById(id).orElseThrow(()->new RuntimeException("Not found!!"));
    }

    public User updateUser(Long id,User fetchUser)
    {
        User user=findById(id);
        user.setAddress(fetchUser.getAddress());
        user.setName(fetchUser.getName());
        return userRepository.save(user);
    }

    public String deleteUser(Long id)
    {
        userRepository.deleteById(id);
        return "User with id "+id+" deleted from database";
    }
}
