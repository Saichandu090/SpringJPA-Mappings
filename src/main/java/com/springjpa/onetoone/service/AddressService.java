package com.springjpa.onetoone.service;

import com.springjpa.onetoone.model.Address;
import com.springjpa.onetoone.repository.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressService
{
    @Autowired
    private AddressRepository addressRepository;

    public List<Address> getAll()
    {
        return addressRepository.findAll();
    }
}
