package com.example.student_enrollment_process;


import com.example.student_enrollment_process.Program;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

public interface ProgramRepository extends JpaRepository<Program, String> {
    double findAmountByProgramCode(String programCode);
    // Custom query methods can be defined here if needed
    boolean existsById(String programCode); // This method should be there if you're checking for existence.
 
}