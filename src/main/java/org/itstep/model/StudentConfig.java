package org.itstep.model;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("org.itstep")
public class StudentConfig {

    @Bean
    public Student studentJ(){
        Student student = new JavaStudent();
        student.setName("Java");
        student.setEmail("email");
        student.setPhone("1111");
        return student;
    }

    @Bean
    public Student studentP(){
        Student student = new PythonStudent();
        student.setName("Python");
        student.setEmail("email");
        student.setPhone("2222");
        return student;
    }

    @Bean
    public StudentPlay studentPlay(){
        return new StudentPlay(studentP());
    }










}
