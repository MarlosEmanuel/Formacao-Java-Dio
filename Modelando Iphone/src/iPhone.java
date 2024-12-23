public class iPhone {
    public static void main(String[] args) {
        AparelhoTelefonico aparelho = new AparelhoTelefonico();
        aparelho.ligar("123456789");
        aparelho.atender();
        aparelho.iniciarCorreioVoz();
        System.out.println("--------------------------------");
        NavegadorInternet navegador = new NavegadorInternet();
        navegador.exibirPaginaWeb("https://www.google.com");
        navegador.adicionarAba();
        navegador.atualizarPagina();
        System.out.println("--------------------------------");
        ReprodutorMusical reprodutor = new ReprodutorMusical();
        reprodutor.reproduzirMusica("Musica 1");
        reprodutor.pausa();
    }
}
