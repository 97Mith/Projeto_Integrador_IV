package org.mm.entities;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "tb_modalidade")
public class Modalidade {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "nome")
    private String nome;
    @Column(name = "descricao")
    private String descricao;
    @Column(name = "categoria")
    private String categoria; // masculino sub20 por exemplo
    @OneToMany
    @JoinColumn
    private List<Turma> turmas;

    public Modalidade() {
    }

    public Modalidade(String nome, String descricao, String categoria, List<Turma> turmas) {
        this.nome = nome;
        this.descricao = descricao;
        this.categoria = categoria;
        this.turmas = turmas;
    }

    public Integer getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public List<Turma> getTurmas() {
        return turmas;
    }

    public void setTurmas(List<Turma> turmas) {
        this.turmas = turmas;
    }
}
