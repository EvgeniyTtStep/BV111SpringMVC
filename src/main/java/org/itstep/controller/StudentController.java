package org.itstep.controller;


import org.itstep.model.Student;
import org.itstep.services.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class StudentController {

    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping({"/student", "/"})
    public String students(Model model) {
        model.addAttribute("students", studentService.getAll());
        return "students";
    }

    @GetMapping("/form")
    public String getForm(Model model) {
        model.addAttribute("student", new Student());
        return "form";
    }

    @PostMapping("/form") //@ModelAttribute
    public String postForm(@ModelAttribute Student student) {
        System.out.println("Student: " + student.getName());
        System.out.println("Student: " + student.getEmail());
        if(studentService.getById(student.getStudentId()) != null){
            studentService.updateStudent(student);
        }else {
            studentService.saveStudent(student);
        }
        return "redirect:/student";
    }

    @GetMapping("/update/student/{idStudent}")
    public String updateStudent(@PathVariable Integer idStudent, Model model){
        Student studentById = studentService.getById(idStudent);
        model.addAttribute("student", studentById);
        return "form";
    }

    @GetMapping("/del/student/{idStudent}")
    public String deleteStudent(@PathVariable Integer idStudent){
         studentService.deleteStudent(idStudent);
        return "redirect:/student";
    }

}
