package org.mm.entities;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "tb_aulas")
public class Aula {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "professor_id")
    private Professor professor;

    @Column(name = "avaliacao_da_aula")
    private double avaliacaoDaAula;

    @OneToMany
    @JoinColumn(name = "comentario_avaliacao")
    private  List<ComentarioAula> comentarioAulas;

    @OneToMany
    @JoinColumn(name = "alunos_presentes_id")
    private List<FichaAluno> presentes;

    public Aula() {
    }

    public Aula(Professor professor, double avaliacaoDaAula, List<ComentarioAula> comentarioAulas, List<FichaAluno> presentes) {
        this.professor = professor;
        this.avaliacaoDaAula = avaliacaoDaAula;
        this.comentarioAulas = comentarioAulas;
        this.presentes = presentes;
    }

    public Integer getId() {
        return id;
    }

    public double getAvaliacaoDaAula() {
        return avaliacaoDaAula;
    }

    public void setAvaliacaoDaAula(double avaliacaoDaAula) {
        this.avaliacaoDaAula = avaliacaoDaAula;
    }

    public List<ComentarioAula> getComentarioAulas() {
        return comentarioAulas;
    }

    public void setComentarioAulas(List<ComentarioAula> comentarioAulas) {
        this.comentarioAulas = comentarioAulas;
    }

    public List<FichaAluno> getPresentes() {
        return presentes;
    }

    public void setPresentes(List<FichaAluno> presentes) {
        this.presentes = presentes;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }
}
