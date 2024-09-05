package org.mm.repositories;

import org.mm.entities.Aluno;

public class AlunoRepository extends RepositoryGenerico<Aluno, Integer> {
    public AlunoRepository() {
        super(Aluno.class);
    }
}
