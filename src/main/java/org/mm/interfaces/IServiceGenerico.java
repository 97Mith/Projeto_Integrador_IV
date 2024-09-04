package org.mm.interfaces;

import java.util.List;

public interface IServiceGenerico<T, ID> {
    boolean save(T entity);
    T findById(ID id);
    List<T> findAll();
    boolean delete(ID id);
}
