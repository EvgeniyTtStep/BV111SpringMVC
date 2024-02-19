package org.itstep.model;

import org.springframework.stereotype.Component;

@Component
public class StudentPlay {

//    @Autowired
   private final Student student;

    public StudentPlay(Student student) {
        this.student = student;
    }

//    public StudentPlay(@Qualifier("javaStudent") Student student) {
//        this.student = student;
//    }

//    public StudentPlay(Student javaStudent) {
//        this.student = javaStudent;
//    }


    public void studentPlay(){
       System.out.println(student.study());
   }

}
