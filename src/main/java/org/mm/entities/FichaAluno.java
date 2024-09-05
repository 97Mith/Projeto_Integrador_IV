package org.mm.entities;

import javax.persistence.*;

@Entity
@Table(name = "tb_ficha_do_aluno_na_atividade")
public class FichaAluno {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(nullable = true)
    private double nota;
    @Column(name = "observacoes", nullable = true)
    private String obs;
    @ManyToOne
    @JoinColumn(name = "turma")
    private Turma turma;

    public FichaAluno() {
    }

    public FichaAluno(double nota, String obs, Turma turma) {
        this.nota = nota;
        this.obs = obs;
        this.turma = turma;
    }

    public Integer getId() {
        return id;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public String getObs() {
        return obs;
    }

    public void setObs(String obs) {
        this.obs = obs;
    }

    public Turma getTurma() {
        return turma;
    }

    public void setTurma(Turma turma) {
        this.turma = turma;
    }
}
