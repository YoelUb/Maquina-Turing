package com.maquinaturing.builder3.director;

import com.maquinaturing.builder3.builder.ProgramaBuilder;
import com.maquinaturing.builder3.producto.Programa;

public class ProgramaDirector {
    private ProgramaBuilder builder;

    public void setBuilder(ProgramaBuilder builder) {
        this.builder = builder;
    }

    public Programa construirPrograma() {
        builder.reset();
        builder.configurar();
        return builder.build();
    }
}
