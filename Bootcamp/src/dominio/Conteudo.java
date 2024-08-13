package dominio;

public abstract class Conteudo {

    protected static final double XP_PADRAO = 10d;

    private String titulo;
    private String descricao;
    private Dev tutor;

    public Conteudo(String titulo, String descricao, Dev tutor){
        this.titulo = titulo;
        this.tutor = tutor;
        this.descricao = descricao;
    }

    public abstract double calcularXp();

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Dev getTutor() {
        return tutor;
    }

    public void setTutor(Dev tutor) {
        this.tutor = tutor;
    }
}