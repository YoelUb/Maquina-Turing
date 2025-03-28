package com.maquinaturing.builder3.builder;

import com.maquinaturing.builder3.producto.Reverser;
import com.maquinaturing.builder3.producto.Programa;

public class ReverserBuilder implements ProgramaBuilder {
    private Reverser programa;

    public ReverserBuilder() {
        reset();
    }

    @Override
    public void reset() {
        this.programa = new Reverser();
    }

    @Override
    public void configurar() {
        this.programa.setCadena("abcde"); // ejemplo
    }

    @Override
    public Programa build() {
        return this.programa;
    }
}
