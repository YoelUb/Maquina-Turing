package com.maquinaturing.builder.director;

import com.maquinaturing.builder.builder.ProgramaBuilder;
import com.maquinaturing.builder.producto.Programa;

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
