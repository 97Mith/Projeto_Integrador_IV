package org.mm.repositories;

import org.mm.entities.Modalidade;

public class ModalidadeRepository extends RepositoryGenerico<Modalidade, Integer> {
    public ModalidadeRepository() {
        super(Modalidade.class);
    }
}
