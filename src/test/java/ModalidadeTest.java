import org.mm.entities.Modalidade;
import org.mm.repositories.ModalidadeRepository;

public class ModalidadeTest {
    public static void main(String[] args) {
        Modalidade modalidade = new Modalidade();
        modalidade.setNome("Manhã Volei");
        modalidade.setCategoria("Feminino Sub 17");
        modalidade.setDescricao("Apenas meninas ricas");

        ModalidadeRepository repository = new ModalidadeRepository();

        repository.save(modalidade);

    }
}
