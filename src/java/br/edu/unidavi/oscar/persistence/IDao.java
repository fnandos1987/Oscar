package br.edu.unidavi.oscar.persistence;

import java.util.ArrayList;

public interface IDao<T> {

    public void save(T entity);
    public void update(T entity);
    public void delete(T entity);
    public ArrayList<T> findAll();
    public T findById(Object object);
}
