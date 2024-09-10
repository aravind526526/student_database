package com.example.student_database.Service;
import java.util.List;

import com.example.student_database.Entity.Student;
import com.example.student_database.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
public class StudentService
{
    @Autowired
    private StudentRepository studentRepository;

    public List<Student> findAll() {
        return studentRepository.findAll();
    }

    public Student findById(int id) {
        return studentRepository.findById(id).get();
    }

    @Transactional
    public Student save(Student student) {
        return studentRepository.save(student);
    }
}