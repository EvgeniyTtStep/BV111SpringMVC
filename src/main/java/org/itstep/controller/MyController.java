package org.itstep.controller;


import org.itstep.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Controller
public class MyController {

    List<Student> students = new ArrayList<>(List.of(
            new Student("Jack", "jacj@email", "111"),
            new Student("Bob", "bob@email", "222"))
    );


    @GetMapping("/home") //@RequestParam - бере данні з форми
    public String home(@RequestParam(value = "name", required = false, defaultValue = "John Dou") String name, Model model) {
        model.addAttribute("name", name);
        return "home";
    }

    @GetMapping("/home/{city}")
    public String path(@PathVariable("city") String city, Model model) {
        model.addAttribute("city", city);
        return "home";
    }

    @GetMapping("/students")
    public String students(Model model) {
        model.addAttribute("students", students);
        return "students";
    }


    @GetMapping("/form")
    public String getForm(){
        return "form";
    }

//    @PostMapping("/form") //@ModelAttribute
//    public String postForm(@RequestParam(value = "name")String name,
//                           @RequestParam(value = "email")String email,
//                           @RequestParam(value = "phone")String phone){
//        students.add(new Student(name, email,phone));
//
//        return "redirect:/students";
//    }

    @PostMapping("/form") //@ModelAttribute
    public String postForm(@ModelAttribute Student student){
        students.add(student);
        return "redirect:/students";
    }
}
