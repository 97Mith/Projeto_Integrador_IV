import org.mm.entities.Aluno;
import org.mm.entities.Modalidade;
import org.mm.entities.Turma;
import org.mm.repositories.AlunoRepository;
import org.mm.repositories.ModalidadeRepository;
import org.mm.repositories.TurmaRepository;

import java.util.Date;
import java.util.List;

public class TurmaTest {
    public static void main(String[] args) {
        AlunoRepository alunoRepository = new AlunoRepository();
        ModalidadeRepository modalidadeRepository = new ModalidadeRepository();
        //List<Aluno> alunos = alunoRepository.findAll();
        Modalidade modalidade = modalidadeRepository.findById(1);

        Turma turma = new Turma();
        turma.setModalidade(modalidade);

        TurmaRepository repository = new TurmaRepository();

        repository.save(turma);
    }
}
