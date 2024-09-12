package org.mm.repositories;

import org.mm.entities.Aluno;
import org.mm.entities.ComentarioAula;

public class ComentarioAulaRepository extends RepositoryGenerico<ComentarioAula, Integer> {
    public ComentarioAulaRepository() {
        super(ComentarioAula.class);
    }
}
