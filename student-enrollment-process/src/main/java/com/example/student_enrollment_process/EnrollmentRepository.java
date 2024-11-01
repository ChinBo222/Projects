package com.example.student_enrollment_process;

import org.springframework.data.jpa.repository.JpaRepository;

public interface EnrollmentRepository extends JpaRepository<Enrollment, Integer> {
    boolean existsByProgramCode(String programCode);
}
