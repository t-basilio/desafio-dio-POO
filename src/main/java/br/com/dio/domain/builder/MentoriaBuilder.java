package br.com.dio.domain.builder;

import br.com.dio.domain.Mentoria;

import java.time.LocalDate;

public class MentoriaBuilder {

    private final Mentoria instance;

    public MentoriaBuilder() {
        this.instance = new Mentoria();
    }

    public MentoriaBuilder titulo(String titulo) {
        this.instance.setTitulo(titulo);
        return this;
    }

    public MentoriaBuilder descricao(String descricao) {
        this.instance.setDescricao(descricao);
        return this;
    }

    public Mentoria build() {
        this.instance.setData(LocalDate.now());
        return this.instance;
    }
}
