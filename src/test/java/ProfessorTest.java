import org.mm.entities.Professor;
import org.mm.repositories.ProfessorRepository;

public class ProfessorTest {
    public static void main(String[] args) {
        Professor p = new Professor();

        p.setNome("Joe Stum");
        p.setCargo("docente");
        p.setLicenca("32155666");
        p.setEmail("prof@instituicao.com");
        p.setSenha("marcosBoi0l@");
        p.setCpf("123654456");

        ProfessorRepository professorRepository = new ProfessorRepository();

        professorRepository.save(p);
        System.out.print("Professor salvo com sucesso!");
    }
}
