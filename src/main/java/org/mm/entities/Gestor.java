package org.mm.entities;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "tb_gestor")
public class Gestor extends Pessoa{
    public Gestor() {
    }

    public Gestor(String nome, String cpf, String tel, String email, String senha, String cargo, boolean estaAtivo) {
        super(nome, cpf, tel, email, senha, cargo, estaAtivo);
    }



}
