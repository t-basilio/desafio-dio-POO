package br.com.dio;

import br.com.dio.dominio.Bootcamp;
import br.com.dio.dominio.Curso;
import br.com.dio.dominio.Dev;
import br.com.dio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        Curso curso = new Curso("Curso Java", "Descricao curso java", 8);
        Curso curso2 = new Curso("Curso js", "Descricao curso js", 4);

        Mentoria mentoria = new Mentoria("Mentoria Java", "Descrição mentoria Java", LocalDate.now());

        Bootcamp bootcamp = new Bootcamp("Bootcamp Java", "Descrição Bootcamp Java");
        bootcamp.getConteudos().add(curso);
        bootcamp.getConteudos().add(curso2);
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
