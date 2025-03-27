package com.maquinaturing.builder;

import com.maquinaturing.producto.Reverser;
import com.maquinaturing.producto.Programa;

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
