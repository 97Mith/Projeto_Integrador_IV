package org.mm.entities;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "tb_alunos")
public class Aluno extends Pessoa {

    @Column(name = "data_de_nascimento", nullable = false)
    private Date dataNasc;
    @Column(name = "pontuacao")
    private Integer rating;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "modalidades")
    private List<FichaAluno> fichasAluno;

    @OneToMany//(cascade = CascadeType.ALL)
    @Column(name = "historico_de_comentarios")
    private List<ComentarioAula> historicoComentarios;

    public Aluno() {
        super();
    }

    public Aluno(String nome, String cpf, String tel, String email, String senha, String cargo, boolean estaAtivo,
                 Date dataNasc, Integer rating, List<FichaAluno> fichasAluno) {
        super(nome, cpf, tel, email, senha, cargo, estaAtivo);
        this.dataNasc = dataNasc;
        this.rating = rating;
        this.fichasAluno = fichasAluno;
    }

    public List<ComentarioAula> getHistoricoComentarios() {
        return historicoComentarios;
    }

    public void setHistoricoComentarios(List<ComentarioAula> historicoComentarios) {
        this.historicoComentarios = historicoComentarios;
    }

    public Date getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(Date dataNasc) {
        this.dataNasc = dataNasc;
    }

    public Integer getRating() {
        return rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }

    public List<FichaAluno> getFichasAluno() {
        return fichasAluno;
    }

    public void setFichasAluno(List<FichaAluno> fichasAluno) {
        this.fichasAluno = fichasAluno;
    }
}
