package com.springjpa.manytomany.controller;

import com.springjpa.manytomany.model.Course;
import com.springjpa.manytomany.model.Student;
import com.springjpa.manytomany.service.CourseService;
import com.springjpa.manytomany.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student/course")
public class StudentCourseController
{
    @Autowired
    private StudentService studentService;

    @Autowired
    private CourseService courseService;

    @PostMapping("/addStudent")
    public Student addStudent(@RequestBody Student student)
    {
        return studentService.saveStudent(student);
    }

    @GetMapping("/allStudents")
    public List<Student> getALl()
    {
        return studentService.getAllStudents();
    }

    @GetMapping("/{name}")
    public List<Student> getByName(@PathVariable String name)
    {
        return studentService.findByName(name);
    }

    @GetMapping("/{usn}")
    public Student getById(@PathVariable int usn)
    {
        return studentService.findById(usn);
    }

    @GetMapping("/getAllCourses")
    public List<Course> getAll()
    {
        return courseService.getAllCourses();
    }

    @GetMapping("/byFee/{fees}")
    public List<Course> getCoursesByFee(@PathVariable double fees)
    {
        return courseService.findByFeeLessThan(fees);
    }
}
