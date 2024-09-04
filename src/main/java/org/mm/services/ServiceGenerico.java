package org.mm.services;

import org.mm.interfaces.IRepositoryGenerico;
import org.mm.interfaces.IServiceGenerico;

import javax.swing.*;
import java.util.List;

public class ServiceGenerico<T, ID> implements IServiceGenerico<T, ID> {

    private IRepositoryGenerico<T, ID> repository;

    public ServiceGenerico(IRepositoryGenerico<T, ID> repository) {
        this.repository = repository;
    }

    @Override
    public boolean save(T entity) {
        try {
            repository.save(entity);
            JOptionPane.showMessageDialog(null,
                    "Operação realizada com sucesso!",
                    "Aviso",
                    JOptionPane.INFORMATION_MESSAGE);
            return true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,
                    "Erro ao salvar a entidade!",
                    "Aviso",
                    JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }

    @Override
    public T findById(ID id) {
        try {
            return repository.findById(id);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,
                    "Erro ao buscar a entidade!",
                    "Aviso",
                    JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public List<T> findAll() {
        try {
            return repository.findAll();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,
                    "Erro ao buscar entidades!",
                    "Aviso",
                    JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public boolean delete(ID id) {
        try {
            repository.delete(id);
            JOptionPane.showMessageDialog(null,
                    "Entidade deletada com sucesso!",
                    "Aviso",
                    JOptionPane.INFORMATION_MESSAGE);
            return true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,
                    "Erro ao deletar a entidade!",
                    "Aviso",
                    JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
            return false;
        }
    }
}
