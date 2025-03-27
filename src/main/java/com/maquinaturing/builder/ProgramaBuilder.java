package com.maquinaturing.builder;

import com.maquinaturing.producto.Programa;

public interface ProgramaBuilder {
    void reset();
    void configurar();
    Programa build();
}
