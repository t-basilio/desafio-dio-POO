package br.com.dio.domain.builder;

import br.com.dio.domain.Curso;

public class CursoBuilder {

    private final Curso instance;

    public CursoBuilder() {
        this.instance = new Curso();
    }

    public CursoBuilder titulo(String titulo) {
        this.instance.setTitulo(titulo);
        return this;
    }

    public CursoBuilder descricao(String descricao) {
        this.instance.setDescricao(descricao);
        return this;
    }

    public CursoBuilder cargaHoraria(int cargaHoraria) {
        this.instance.setCargaHoraria(cargaHoraria);
        return this;
    }

    public Curso build() {
        return this.instance;
    }
}
