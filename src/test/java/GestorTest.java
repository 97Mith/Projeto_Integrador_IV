import org.mm.entities.Gestor;
import org.mm.repositories.GestorRepository;

import java.util.List;

public class GestorTest {
    public static void main(String[] args) {
        Gestor p = new Gestor();
        p.setNome("Joseph Joestar");
        p.setCargo("adm");
        p.setEmail("adm@instituicao.com");
        p.setSenha("marcosBoi0l@");
        p.setCpf("12365445678");

        GestorRepository gestorRepository = new GestorRepository();
        gestorRepository.save(p);
        List<Gestor> g = gestorRepository.findAll();

        for (Gestor gg: g) {
            System.out.println(gg.getNome());
        }
    }
}
