package com.example.student_enrollment_process;

//import dependency classes
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Column;

//This Java file is to set up the variables that the data is going to fill.

@Entity
//refer to the Students table inside the DB
@Table(name = "students")
//create a class called student
public class Student {
    @Id
    //primary key is set up already in the database
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //declares the variables used to hold student information
    private Integer studentId;
    private String userName;
    private String password;
    //code doesn't seem to connect to the database if I don't use column to match the casing to the database.
    //added: "spring.jpa.hibernate.naming.physical-strategy=org.hibernate.boot.model.naming.PhysicalNamingStrategyStandardImpl" to the application.yml to avoid conversion of naming
    @Column(name = "firstName")
    private String firstName;
    @Column(name = "lastName")
    private String lastName;
    private String address;
    private String city;
    private String postalCode;
    private String technicalSkills;

// Getters and Setters, so field data can be accessed

    public int getStudentId() {
        return studentId;
    }


    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getTechnicalSkills() {
        return technicalSkills;
    }

    public void setTechnicalSkills(String technicalSkills) {
        this.technicalSkills = technicalSkills;
    }
}