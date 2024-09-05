package org.mm.entities;

import javax.persistence.*;

@Entity
@Table(name = "tb_pessoas")
@Inheritance(strategy = InheritanceType.JOINED)
public class Pessoa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "nome_da_pessoa", nullable = false)
    private String nome;

    @Column(name = "CPF", nullable = false)
    private String cpf;

    @Column(name = "telefone")
    private String tel;

    @Column(name = "email_ou_login", nullable = false)
    private String email;

    @Column(name = "senha_usuario", nullable = false)
    private String senha;

    @Column(name = "cargo_ou_funcao", nullable = false)
    private String cargo;
    @Column(name = "esta_ativo")
    private boolean estaAtivo;

    public Pessoa() {
    }

    public Pessoa(String nome, String cpf, String tel, String email, String senha, String cargo, boolean estaAtivo) {
        this.nome = nome;
        this.cpf = cpf;
        this.tel = tel;
        this.email = email;
        this.senha = senha;
        this.cargo = cargo;
        this.estaAtivo = estaAtivo;
    }

    public String getNome() {
        return nome;
    }

    public Integer getId() {
        return id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public boolean isEstaAtivo() {
        return estaAtivo;
    }

    public void setEstaAtivo(boolean estaAtivo) {
        this.estaAtivo = estaAtivo;
    }
}
