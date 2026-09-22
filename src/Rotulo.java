public class Rotulo implements ComponenteUI {

    private String texto;

    public Rotulo(String texto) {
        this.texto = texto;
    }

    @Override
    public void renderizar() {
        System.out.println("Rotulo: " + texto);
    }
}