package com.example.student_enrollment_process;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;

@Controller
public class EnrollmentController {

    @Autowired
    private EnrollmentRepository enrollmentRepository;

    @Autowired
    private ProgramRepository programRepository;

    @Autowired
    private StudentRepository studentRepository;

    @PostMapping("/enroll")
    public String enrollStudent(
            @RequestParam String programCode,
            @RequestParam String username,
            Model model) {

        // Retrieve studentId based on the provided username
        Integer studentId = getStudentIdFromUsername(username);

        // Check if studentId is valid and program code exists
        if (studentId != null && programRepository.existsById(programCode)) {
            Enrollment enrollment = new Enrollment();
            enrollment.setStudentId(studentId); // Set the student ID directly
            enrollment.setProgramCode(programCode); // Set the program code directly

            // Retrieve the program entity to get the fee
            Program program = programRepository.findById(programCode).orElse(null);
            if (program != null) {
                double amountPaid = program.getFee(); // Assuming you have a 'getFee()' method
                enrollment.setAmountPaid(amountPaid);
                enrollment.setStartDate(LocalDate.now().toString());

                // Save the enrollment
                enrollmentRepository.save(enrollment);
                model.addAttribute("enrollmentSuccess", "Enrollment successful! Application number: " + enrollment.getApplicationNo());
            }
        } else {
            model.addAttribute("enrollmentError", "Invalid program code or student not found.");
        }

        // Redirect back to programs page after enrollment
        return "welcome"; // Ensure this matches your HTML page name
    }

    private Integer getStudentIdFromUsername(String username) {
        // Retrieve student based on the username
        Student student = studentRepository.findByUserName(username);
        if (student != null) {
            return student.getStudentId(); // Get the student ID from the retrieved student object
        }
        return null; // Return null if the student is not found
    }
}
