package org.mm.entities;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "tb_professores")
public class Professor extends Pessoa{
    @OneToMany
    @JoinColumn(name = "turma_ids")
    private List<Turma> turmas;

    @Column(name = "numero_da_licenca")
    private String licenca;

    @OneToMany
    @JoinColumn(name = "lista_aulas")
    private List<Aula> aulas;

    public Professor() {
        super();
    }

    public Professor(String nome, String cpf, String tel, String email, String senha, String cargo, boolean estaAtivo, List<Turma> turmas, String licenca) {
        super(nome, cpf, tel, email, senha, cargo, estaAtivo);
        this.turmas = turmas;
        this.licenca = licenca;
    }

    public List<Aula> getAulas() {
        return aulas;
    }

    public void setAulas(List<Aula> aulas) {
        this.aulas = aulas;
    }

    public List<Turma> getTurmas() {
        return turmas;
    }

    public void setTurmas(List<Turma> turmas) {
        this.turmas = turmas;
    }

    public String getLicenca() {
        return licenca;
    }

    public void setLicenca(String licenca) {
        this.licenca = licenca;
    }
}
