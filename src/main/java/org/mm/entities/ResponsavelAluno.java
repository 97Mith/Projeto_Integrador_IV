package org.mm.entities;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;

@Entity
@Table(name = "responsavel_pelo_aluno")
public class ResponsavelAluno extends Pessoa{

    @OneToMany
    @JoinColumn(name = "faturas")
    private List<FaturaAluno> faturas;

    @OneToMany
    @JoinColumn(name = "responsavel_por")
    private List<Aluno> responsavelPor;

    public ResponsavelAluno() {
        super();
    }

    public ResponsavelAluno(String nome, String cpf, String tel, String email, String senha, String cargo, boolean estaAtivo, List<FaturaAluno> faturas, List<Aluno> responsavelPor) {
        super(nome, cpf, tel, email, senha, cargo, estaAtivo);
        this.faturas = faturas;
        this.responsavelPor = responsavelPor;
    }

    public List<FaturaAluno> getFaturas() {
        return faturas;
    }

    public void setFaturas(List<FaturaAluno> faturas) {
        this.faturas = faturas;
    }

    public List<Aluno> getResponsavelPor() {
        return responsavelPor;
    }

    public void setResponsavelPor(List<Aluno> responsavelPor) {
        this.responsavelPor = responsavelPor;
    }
}
