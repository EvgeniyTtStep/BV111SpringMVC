package org.itstep.controller;


import org.itstep.model.Student;
import org.itstep.services.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class StudentController {

    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/student")
    public String students(Model model) {
        model.addAttribute("students", studentService.getAll());
        return "students";
    }

    @GetMapping("/form")
    public String getForm() {
        return "form";
    }

    @PostMapping("/form") //@ModelAttribute
    public String postForm(@ModelAttribute Student student) {
        System.out.println("Student: " + student.getName());
        System.out.println("Student: " + student.getEmail());
        studentService.saveStudent(student);
        return "redirect:/student";
    }

}
