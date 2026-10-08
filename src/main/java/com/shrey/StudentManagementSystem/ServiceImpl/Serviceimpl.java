package com.shrey.StudentManagementSystem.ServiceImpl;

import com.shrey.StudentManagementSystem.Service.StudentService;
import com.shrey.StudentManagementSystem.Student.Student;
import com.shrey.StudentManagementSystem.repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Serviceimpl implements StudentService {

    private final StudentRepository studentRepository;

    public Serviceimpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    @Override
    public Student getStudentById(Long id) {
        return studentRepository.findById(Math.toIntExact(id)).get();
    }

    @Override
    public Student updateStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public void deleteStudentById(Long id) {
        studentRepository.deleteById(Math.toIntExact(id));
    }

    @Override
    public void deleteById(int id) {
        studentRepository.deleteById(id);
    }
}