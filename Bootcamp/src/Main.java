import dominio.Bootcamp;
import dominio.Curso;
import dominio.Dev;
import dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Dev tutor1 = new Dev("tutor1");
        Dev tutor2 = new Dev("tutor2");

        Curso curso1 = new Curso("curso java", "descricao curso java", tutor1, 8);
        Curso curso2 = new Curso("curso js", "descricao curso js", tutor2, 4);
        Mentoria mentoria = new Mentoria("mentoria de java", "descricao mentoria java", tutor2, LocalDate.now());

        Bootcamp bootcamp = new Bootcamp("Bootcamp Java Developer", "Descrição Bootcamp Java Developer");
        bootcamp.addConteudo(curso1);
        bootcamp.addConteudo(curso2);
        bootcamp.addConteudo(mentoria);

        Dev devCamila = new Dev("Camila");
        devCamila.inscreverBootcamp(bootcamp);

        System.out.println("Conteudos Inscritos Camila:" + devCamila.getConteudosInscritos());
        devCamila.progredir();
        devCamila.progredir();
        System.out.println("-");
        System.out.println("Conteudos Inscritos Camila:" + devCamila.getConteudosInscritos());
        System.out.println("Conteudos Concluidos Camila:" + devCamila.getConteudosConcluidos());
        System.out.println("XP:" + devCamila.calcularTotalXp());
        System.out.println("-------");
        
        Dev devJoao = new Dev("Joao");
        devJoao.inscreverBootcamp(bootcamp);

        System.out.println("Conteudos Inscritos Joao:" + devJoao.getConteudosInscritos());
        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("-");
        System.out.println("Conteudos Inscritos Joao:" + devJoao.getConteudosInscritos());
        System.out.println("Conteudos Concluidos Joao:" + devJoao.getConteudosConcluidos());
        System.out.println("XP:" + devJoao.calcularTotalXp());
        System.out.println("-------");
        System.out.println("Camila: Conteudos Concluidos=" + devCamila.countConteudosConcluidos() + " - Conteudos Inscritos=" + devCamila.countConteudosInscritos());
        System.out.println("Joao: Conteudos Concluidos=" + devJoao.countConteudosConcluidos() + " - Conteudos Inscritos=" + devJoao.countConteudosInscritos());

    }

}