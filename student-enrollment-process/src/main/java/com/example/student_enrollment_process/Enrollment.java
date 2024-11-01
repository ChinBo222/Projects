package com.example.student_enrollment_process;

import jakarta.persistence.*;

@Entity
@Table(name = "Enrollments")
public class Enrollment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int applicationNo;

    private int studentId; // Storing student ID directly
    private String programCode; // Storing program code directly

    private String startDate;
    private double amountPaid;

    // Getters and Setters
    public int getApplicationNo() {
        return applicationNo;
    }

    public void setApplicationNo(int applicationNo) {
        this.applicationNo = applicationNo;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getProgramCode() {
        return programCode;
    }

    public void setProgramCode(String programCode) {
        this.programCode = programCode;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public double getAmountPaid() {
        return amountPaid;
    }

    public void setAmountPaid(double amountPaid) {
        this.amountPaid = amountPaid;
    }
}
