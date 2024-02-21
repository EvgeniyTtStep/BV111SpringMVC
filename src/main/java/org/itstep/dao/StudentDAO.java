package org.itstep.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.itstep.model.Student;
import org.springframework.stereotype.Repository;

import java.util.List;

import static org.itstep.util.HibernateUtil.*;

@Repository
public class StudentDAO implements TemplateDAO<Student, Integer> {

    @Override
    public void save(Student student) {
        Session session = getSession();
        Transaction transaction = session.beginTransaction();
        session.merge(student);
        transaction.commit();
        closeSession();
    }

    @Override
    public void update(Student student) {
        Session session = getSession();
        Transaction transaction = session.beginTransaction();
        session.merge(student);
        transaction.commit();
        closeSession();
    }

    @Override
    public void delete(Integer id) {
        Session session = getSession();
        Transaction transaction = session.beginTransaction();
        session.remove(getById(id));
        transaction.commit();
        closeSession();

    }

    @Override
    public Student getById(Integer id) {
        Session session = getSession();
        return session.get(Student.class, id);
    }

    public List<Student> getAll() {
        Session session = getSession();
        Query<Student> query = session.createQuery("from Student", Student.class);
        return query.list();
    }
}
