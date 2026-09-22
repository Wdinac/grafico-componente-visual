import java.util.ArrayList;
import java.util.List;

public class Painel implements ComponenteUI {

    private List<ComponenteUI> filhos;

    public Painel() {
        filhos = new ArrayList<>();
    }

    public void adicionar(ComponenteUI c) {
        filhos.add(c);
    }

    public void remover(ComponenteUI c) {
        filhos.remove(c);
    }

    @Override
    public void renderizar() {
        System.out.println("=== Painel ===");

        for (ComponenteUI filho : filhos) {
            filho.renderizar();
        }

        System.out.println("==============");
    }
}