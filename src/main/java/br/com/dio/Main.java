package br.com.dio;

import br.com.dio.domain.Bootcamp;
import br.com.dio.domain.Curso;
import br.com.dio.domain.Dev;
import br.com.dio.domain.Mentoria;
import br.com.dio.domain.builder.CursoBuilder;
import br.com.dio.domain.builder.MentoriaBuilder;

public class Main {

    public static void main(String[] args) {
        Curso cursoJava = new CursoBuilder()
                .titulo("Curso Java Developer")
                .descricao("Descricao curso java")
                .cargaHoraria(20)
                .build();

        Curso cursoJs = new CursoBuilder()
                .titulo("Curso js")
                .descricao("Descricao curso js")
                .cargaHoraria(15)
                .build();

        Mentoria mentoria = new MentoriaBuilder()
                .titulo("Mentoria Java")
                .descricao("Descrição mentoria Java")
                .build();

        Bootcamp bootcamp = new Bootcamp("Bootcamp Java", "Descrição Bootcamp Java");
        bootcamp.getConteudos().add(cursoJava);
        bootcamp.getConteudos().add(cursoJs);
        bootcamp.getConteudos().add(mentoria);

        Dev camila = new Dev("Camila");
        camila.inscreverBootcamp(bootcamp);
        camila.progredir();
        System.out.println("Conteúdos de Camila");
        camila.getConteudosInscritos().forEach(c -> System.out.printf("%s%n", c));
        System.out.println("Conteúdos de Cocluidos");
        camila.getConteudosConcluidos().forEach(c -> System.out.printf("%s%n", c));
        System.out.println("XP: " + camila.calcularTotalXp());

        System.out.println();
        Dev joao = new Dev("João");
        joao.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos de João");
        joao.getConteudosInscritos().forEach(c -> System.out.printf("%s%n", c));
        System.out.println("Conteúdos de Cocluidos");
        joao.getConteudosConcluidos().forEach(c -> System.out.printf("%s%n", c));
        System.out.println("XP: " + joao.calcularTotalXp());


    }
}
