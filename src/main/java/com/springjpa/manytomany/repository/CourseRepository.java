package com.springjpa.manytomany.repository;

import com.springjpa.manytomany.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CourseRepository extends JpaRepository<Course,Long>
{
    List<Course> findByFeeLessThan(Double fees);
}
