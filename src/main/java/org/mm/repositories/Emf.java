package org.mm.repositories;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Emf {
    public static EntityManagerFactory iniciarConexao(){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("unit-jpa");
        return emf;
    }
}
