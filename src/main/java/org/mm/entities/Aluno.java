package org.mm.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import java.util.Date;
import java.util.List;

@Entity
public class Aluno extends Pessoa {

    @Column(name = "data_de_nascimento", nullable = false)
    private Date dataNasc;

    @Column(name = "pontuacao")
    private Integer rating;

    @OneToMany
    @JoinColumn(name = "modalidades")
    private List<FichaAluno> fichasAluno;

    public Aluno() {
    }

    public Aluno(String nome, String cpf, String tel, String email, String senha, String cargo, boolean estaAtivo,
                 Date dataNasc, Integer rating, List<FichaAluno> fichasAluno) {
        super(nome, cpf, tel, email, senha, cargo, estaAtivo);
        this.dataNasc = dataNasc;
        this.rating = rating;
        this.fichasAluno = fichasAluno;
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
