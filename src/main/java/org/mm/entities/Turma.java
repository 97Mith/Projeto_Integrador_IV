package org.mm.entities;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "tb_turmas")
public class Turma {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @ManyToOne
    @JoinColumn(name = "modalidade")
    private Modalidade modalidade;
    @Column(name = "hora_do_treino")
    private Date horarioTreino;
    @ManyToOne
    @JoinColumn(name = "professor_da_atividade")
    private Professor professor;
    @OneToMany
    @JoinColumn(name = "alunos")
    private List<FichaAluno> alunos;

    public Turma() {
        super();
    }

    public Turma(Modalidade modalidade, Date horarioTreino, Professor professor, List<FichaAluno> alunos) {
        this.modalidade = modalidade;
        this.horarioTreino = horarioTreino;
        this.professor = professor;
        this.alunos = alunos;
    }

    public Integer getId() {
        return id;
    }

    public Modalidade getModalidade() {
        return modalidade;
    }

    public void setModalidade(Modalidade modalidade) {
        this.modalidade = modalidade;
    }

    public Date getHorarioTreino() {
        return horarioTreino;
    }

    public void setHorarioTreino(Date horarioTreino) {
        this.horarioTreino = horarioTreino;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public List<FichaAluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(List<FichaAluno> alunos) {
        this.alunos = alunos;
    }
}
