package com.example.studentlogin.service;

import com.example.studentlogin.model.Student;
import com.example.studentlogin.dto.StudentDto;
import java.util.List;

public interface StudentService {
    void saveStudent(StudentDTO studentDto);
    Student findStudentByEmail(String email);
    List<StudentDTO> findAllStudents();
}

