public class Botao implements ComponenteUI {

    private String texto;

    public Botao(String texto) {
        this.texto = texto;
    }

    @Override
    public void renderizar() {
        System.out.println("[Botao: " + texto + "]");
    }
}