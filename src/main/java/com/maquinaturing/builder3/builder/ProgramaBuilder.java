package com.maquinaturing.builder3.builder;

import com.maquinaturing.builder3.producto.Programa;

public interface ProgramaBuilder {
    void reset();
    void configurar();
    Programa build();
}
