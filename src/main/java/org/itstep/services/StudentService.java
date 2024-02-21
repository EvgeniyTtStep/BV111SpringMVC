package org.itstep.services;

import org.itstep.dao.StudentDAO;
import org.itstep.model.Student;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class StudentService {

    private final StudentDAO studentDAO;

    public StudentService(StudentDAO studentDAO) {
        this.studentDAO = studentDAO;
    }


    public void saveStudent(Student student) {
        studentDAO.save(student);
    }

    public List<Student> getAll() {
        return studentDAO.getAll();
    }

    public Student getById(Integer idStudent) {
        if (idStudent != null) {
            return studentDAO.getById(idStudent);
        }
        return null;
    }

    public void updateStudent(Student student) {
        studentDAO.update(student);
    }

    public void deleteStudent(Integer idStudent) {
        if(idStudent!=null){
            studentDAO.delete(idStudent);
        }
    }
}
