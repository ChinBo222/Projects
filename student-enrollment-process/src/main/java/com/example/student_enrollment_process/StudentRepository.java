package com.example.student_enrollment_process;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.student_enrollment_process.Student;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {
    // Custom query method to find a student by username
    Student findByUserName(String userName);
}



