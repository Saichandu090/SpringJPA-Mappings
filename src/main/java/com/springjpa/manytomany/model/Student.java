package com.springjpa.manytomany.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Entity
@Table(name = "student_table")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int usn;
    private String name;
    private int age;
    private String dept;

    @ManyToMany(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    @JoinTable(name = "Student_Course",
    joinColumns = {
            @JoinColumn(name = "student_id", referencedColumnName = "usn")
    },
    inverseJoinColumns = {
            @JoinColumn(name = "course_id",referencedColumnName = "id")
    })
    private Set<Course> courses;
}
