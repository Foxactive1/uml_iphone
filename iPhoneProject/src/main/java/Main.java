public class Main {
    public static void main(String[] args) {
        ReprodutorMusical reprodutor = new ReprodutorMusical();
        AparelhoTelefonico telefone = new AparelhoTelefonico();
        NavegadorInternet navegador = new NavegadorInternet();

        reprodutor.tocar();
        reprodutor.selecionarMusica("Música Exemplo");

        telefone.ligar("123456789");
        telefone.iniciarCorreioVoz();

        navegador.exibirPagina("http://exemplo.com");
        navegador.adicionarNovaAba();
        navegador.atualizarPagina();
    }
}
