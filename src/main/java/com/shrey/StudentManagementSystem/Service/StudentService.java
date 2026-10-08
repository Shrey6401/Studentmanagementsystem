package com.shrey.StudentManagementSystem.Service;

import com.shrey.StudentManagementSystem.Student.Student;
import java.util.List;

public interface StudentService {
    List<Student> getAllStudents();
    Student saveStudent(Student student);
    Student getStudentById(Long id);
    Student updateStudent(Student student); // Recommended for explicit update
    void deleteStudentById(Long id);// Required if you want the upcoming Delete feature
    void deleteById(int id);
}