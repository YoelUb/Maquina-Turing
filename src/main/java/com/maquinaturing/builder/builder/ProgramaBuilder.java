package com.maquinaturing.builder.builder;

import com.maquinaturing.builder.producto.Programa;

public interface ProgramaBuilder {
    void reset();
    void configurar();
    Programa build();
}
