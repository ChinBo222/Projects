package com.example.student_enrollment_process;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentEnrollmentProcessApplication {
	public static void main(String[] args) {
        //run the program
		SpringApplication.run(StudentEnrollmentProcessApplication.class, args);
        //print message so I know it's actually running
		
		System.out.println("SpringBoot is running on localhost:8083");
	}
}
