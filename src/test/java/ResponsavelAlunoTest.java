import org.mm.entities.ResponsavelAluno;
import org.mm.repositories.ResponsavelAlunoRepository;

public class ResponsavelAlunoTest {
    public static void main(String[] args) {
        ResponsavelAlunoRepository repository = new ResponsavelAlunoRepository();
        ResponsavelAluno p = new ResponsavelAluno();
        p.setNome("Joe Stum");
        p.setCargo("docente");
        p.setEmail("prof@instituicao.com");
        p.setSenha("marcosBoi0l@");
        p.setCpf("123654456");

        repository.save(p);
    }
}
