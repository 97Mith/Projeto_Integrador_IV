package org.mm.services;

import org.mm.entities.Gestor;
import org.mm.repositories.GestorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GestorService {

    @Autowired
    GestorRepository gestorRepository;

    public Gestor salvarGestor(Gestor gestor){
        gestorRepository.save(gestor);
        return gestor;
    }

}
