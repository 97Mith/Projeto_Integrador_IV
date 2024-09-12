package org.mm.entities;

import javax.persistence.*;

@Entity
@Table(name = "tb_comentarios")
public class ComentarioAula {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "aluno_id")
    private Aluno aluno;

    private String comentario;

    @ManyToOne
    @JoinColumn(name = "aula_id")
    private Aula aula;

    @Column(name = "estrelas")
    private int avaliacao;

    public ComentarioAula() {
    }

    public ComentarioAula(Aluno aluno, String comentario, Aula aula, int avaliacao) {
        this.aluno = aluno;
        this.comentario = comentario;
        this.aula = aula;
        this.avaliacao = avaliacao;
    }

    public Integer getId() {
        return id;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public Aula getAula() {
        return aula;
    }

    public void setAula(Aula aula) {
        this.aula = aula;
    }

    public int getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(int avaliacao) {
        this.avaliacao = avaliacao;
    }
}
