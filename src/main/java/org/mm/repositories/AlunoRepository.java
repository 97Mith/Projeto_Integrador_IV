package org.mm.repositories;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class AlunoRepository {
    static EntityManagerFactory emf = Emf.iniciarConexao();
}
