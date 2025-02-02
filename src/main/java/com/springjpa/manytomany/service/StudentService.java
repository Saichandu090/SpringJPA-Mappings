package com.springjpa.manytomany.service;

import com.springjpa.manytomany.model.Student;
import com.springjpa.manytomany.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService
{
    @Autowired
    private StudentRepository studentRepository;

    public Student saveStudent(Student student)
    {
        return studentRepository.save(student);
    }

    public List<Student> getAllStudents()
    {
        return studentRepository.findAll();
    }

    public List<Student> findByName(String name)
    {
        return studentRepository.findByNameContaining(name);
    }

    public Student findById(int usn)
    {
        return studentRepository.findById(usn).orElseThrow(()->new RuntimeException("Not found!!"));
    }
}
