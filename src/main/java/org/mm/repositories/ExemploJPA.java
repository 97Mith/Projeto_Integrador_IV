package org.mm.repositories;

import org.mm.entities.Gestor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExemploJPA extends JpaRepository<Gestor, Integer> {
}
