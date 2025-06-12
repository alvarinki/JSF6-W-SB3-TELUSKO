package org.acf.SpringJDBCEx.service;

import org.acf.SpringJDBCEx.model.Student;
import org.acf.SpringJDBCEx.repos.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    private StudentRepository repo;

    public StudentRepository getRepo() {
        return repo;
    }

    @Autowired
    public void setRepo(StudentRepository repo) {
        this.repo = repo;
    }

    public void addStudent(Student student) {

        System.out.println("Adding student: " + student.getName());
        repo.save(student);
    }

    public List<Student> getStudents() {

        return repo.findAll();
    }
}
