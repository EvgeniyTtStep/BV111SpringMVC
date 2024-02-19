package org.itstep;

import org.itstep.model.StudentConfig;
import org.itstep.model.StudentPlay;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(StudentConfig.class);
        StudentPlay studentPlay = context.getBean(StudentPlay.class);
        studentPlay.studentPlay();


    }
}
