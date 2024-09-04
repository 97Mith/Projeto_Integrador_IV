package org.mm.interfaces;

import java.util.List;

public interface IRepositoryGenerico<T, ID>{
    void save(T entidade);
    T findById(ID id);
    List<T> findAll();
    void delete(ID id);
}
