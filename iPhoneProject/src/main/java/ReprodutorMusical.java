public class ReprodutorMusical implements iPhone {
    @Override
    public void tocar() {
        System.out.println("Tocando m�sica...");
    }

    @Override
    public void pausar() {
        System.out.println("M�sica pausada.");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("M�sica selecionada: " + musica);
    }
}
