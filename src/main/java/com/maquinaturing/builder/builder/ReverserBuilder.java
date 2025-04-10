package com.maquinaturing.builder.builder;

import com.maquinaturing.builder.producto.Reverser;
import com.maquinaturing.builder.producto.Programa;

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
