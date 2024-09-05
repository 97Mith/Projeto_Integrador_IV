package org.mm.entities;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "tb_faturas_alunos")
public class FaturaAluno {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(nullable = true)
    private Date vencimento;
    @Column(nullable = false)
    private double valor;
    @ManyToOne
    @JoinColumn(name = "responsavel_aluno")
    private ResponsavelAluno responsavelAluno;

    public FaturaAluno() {
    }

    public FaturaAluno(Date vencimento, double valor, ResponsavelAluno responsavelAluno) {
        this.vencimento = vencimento;
        this.valor = valor;
        this.responsavelAluno = responsavelAluno;
    }

    public Integer getId() {
        return id;
    }

    public Date getVencimento() {
        return vencimento;
    }

    public void setVencimento(Date vencimento) {
        this.vencimento = vencimento;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public ResponsavelAluno getResponsavelAluno() {
        return responsavelAluno;
    }

    public void setResponsavelAluno(ResponsavelAluno responsavelAluno) {
        this.responsavelAluno = responsavelAluno;
    }
}
