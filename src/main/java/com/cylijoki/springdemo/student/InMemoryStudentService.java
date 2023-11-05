package com.cylijoki.springdemo.student;

import org.springframework.stereotype.Service;

import java.util.List;

@Service()
public class InMemoryStudentService implements StudentService {

    private final InMemoryStudentDOA DOA;

    public InMemoryStudentService(InMemoryStudentDOA doa) {
        DOA = doa;
    }

    @Override
    public Student save(Student s) {
        return DOA.save(s);
    }

    @Override
    public List<Student> findAllStudents() {
        return DOA.findAllStudents();
    }

    @Override
    public Student findByEmail(String email) {
        return DOA.findByEmail(email);
    }

    @Override
    public Student updateStudent(Student s) {
        return DOA.updateStudent(s);
    }

    @Override
    public void delete(String email) {
        DOA.delete(email);
    }
}
