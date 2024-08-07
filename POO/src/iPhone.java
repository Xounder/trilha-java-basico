public class iPhone implements AparelhoTelefonico, ReprodutorMusical, NavegadorInternet {

    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo a pagina");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando a pagina");
    }

    @Override
    public void tocar() {
        System.out.println("Tocando a musica");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando a musica");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Selecionando a musica escolhida");
    }

    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para o numero");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo a ligacao");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz");
    }
}
