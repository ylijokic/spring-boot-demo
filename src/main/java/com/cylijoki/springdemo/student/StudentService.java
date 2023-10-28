package com.cylijoki.springdemo.student;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class StudentService {

    public List<Student> findAllStudents() {
        return List.of(
            new Student("Charlie", "Ylijoki", LocalDate.now(), "test@gmail.com", 33),
            new Student("Nash", "Ylijoki", LocalDate.now(), "test2@gmail.com", 5)
        );
    }
}
