package com.shrey.StudentManagementSystem.repository;

import com.shrey.StudentManagementSystem.Student.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;




@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {
}
