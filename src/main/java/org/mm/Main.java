package org.mm;

import org.mm.entities.Aluno;
import org.mm.entities.FichaAluno;
import org.mm.interfaces.IRepositoryGenerico;
import org.mm.interfaces.IServiceGenerico;
import org.mm.repositories.AlunoRepository;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<FichaAluno> fichasAluno = Arrays.asList(new FichaAluno(), new FichaAluno());

        Aluno aluno = new Aluno(
                "João Silva",               // nome
                "123.456.789-00",           // cpf
                "11999999999",              // tel
                "joao.silva@example.com",   // email
                "senhaSegura123",           // senha
                "Estudante",                // cargo
                true,                       // estaAtivo
                new Date(),                 // dataNasc
                85,                         // rating
                fichasAluno                 // fichasAluno
        );

        System.out.println("Nome: " + aluno.getNome());
        System.out.println("Data de Nascimento: " + aluno.getDataNasc());
        System.out.println("Pontuação: " + aluno.getRating());
        System.out.println("Número de Fichas: " + aluno.getFichasAluno().size());

        AlunoRepository alunoRepository = new AlunoRepository();

        alunoRepository.save(aluno);

        System.out.println("Aluno salvo no banco de dados com sucesso!");
    }
}