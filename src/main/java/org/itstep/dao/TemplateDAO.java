package org.itstep.dao;

public interface TemplateDAO<T, ID> {
    void save(T t);
    void update(T t);
    void delete(ID id);
    T getById(ID id);

}
