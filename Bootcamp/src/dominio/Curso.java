package dominio;

public class Curso extends Conteudo{

    private int cargaHoraria;


    public Curso(String titulo, String descricao, Dev tutor, int cargaHoraria){
        super(titulo, descricao, tutor);
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public double calcularXp() {
        return XP_PADRAO * cargaHoraria;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", tutor='" + getTutor().getNome() + '\'' +
                ", cargaHoraria=" + cargaHoraria +
                '}';
    }
}