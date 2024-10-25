package com.springjpa.manytomany.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Entity
@Table(name = "course_table")
@AllArgsConstructor
@Data
@NoArgsConstructor
public class Course
{
    @Id
    private long id;
    private String title;
    private String abbreviation;
    private int modules;
    private double fee;

    @ManyToMany(mappedBy = "courses",fetch = FetchType.LAZY)
    private Set<Student> students;
}
