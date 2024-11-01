package com.example.student_enrollment_process;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import java.security.Principal;
import java.util.Date;
import java.util.List;

import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class ProgramController {

    @Autowired
    private ProgramRepository programRepository;

    @GetMapping("/programs")
    public String showPrograms(Model model) {
        List<Program> programs = programRepository.findAll();
        model.addAttribute("programs", programs);
        return "program"; // Refers to program.html
    }



}