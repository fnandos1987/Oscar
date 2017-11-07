package br.edu.unidavi.oscar.persistence;

import java.util.ArrayList;

public interface IDao<T, V> {

    public void save(V entity);
    public void update(V entity);
    public void delete(V entity);
    public ArrayList<V> findAll();
    public V findById(T id);
}
