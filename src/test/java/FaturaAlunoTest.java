import org.mm.entities.FaturaAluno;
import org.mm.repositories.FaturaAlunoRepository;

import java.util.Date;

public class FaturaAlunoTest {
    public static void main(String[] args) {
        FaturaAlunoRepository repository = new FaturaAlunoRepository();

        FaturaAluno faturaAluno = new FaturaAluno();

        faturaAluno.setValor(355);
        repository.save(faturaAluno);
    }
}
