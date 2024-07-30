public class NavegadorInternet implements iPhone {
    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo p�gina: " + url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Nova aba adicionada.");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("P�gina atualizada.");
    }
}
