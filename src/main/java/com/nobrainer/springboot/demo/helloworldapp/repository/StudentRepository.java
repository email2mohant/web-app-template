package com.nobrainer.springboot.demo.helloworldapp.repository;

import com.nobrainer.springboot.demo.helloworldapp.entity.Student;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends CrudRepository<Student, Integer> {
    long count();
    long countAllByEmail(String email);
}
