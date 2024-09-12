package org.mm.repositories;

import org.mm.entities.Professor;

public class ProfessorRepository extends RepositoryGenerico<Professor,Integer> {
    public ProfessorRepository(){super(Professor.class);}
}
