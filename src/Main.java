public class Main {

    public static void main(String[] args) {

        // Criando componentes
        Rotulo titulo = new Rotulo("Sistema de Cadastro");

        Botao salvar = new Botao("Salvar");
        Botao cancelar = new Botao("Cancelar");
        Botao sair = new Botao("Sair");

        // Criando painel principal
        Painel painelPrincipal = new Painel();

        // Adicionando componentes ao painel
        painelPrincipal.adicionar(titulo);
        painelPrincipal.adicionar(salvar);
        painelPrincipal.adicionar(cancelar);

        // Criando outro painel
        Painel painelSecundario = new Painel();

        painelSecundario.adicionar(new Rotulo("Opcoes"));
        painelSecundario.adicionar(sair);

        // Adicionando painel dentro de outro painel
        painelPrincipal.adicionar(painelSecundario);

        // Renderizando toda a interface
        painelPrincipal.renderizar();
    }
}