package com.maquinaturing.builder.builder;


import com.maquinaturing.builder.producto.ContadorSubida;
import com.maquinaturing.builder.producto.Programa;

public class ContadorSubidaBuilder implements ProgramaBuilder {
    private ContadorSubida programa;

    public ContadorSubidaBuilder() {
        reset();
    }

    @Override
    public void reset() {
        this.programa = new ContadorSubida();
    }

    @Override
    public void configurar() {
        this.programa.setLimite(5); // ejemplo
    }

    @Override
    public Programa build() {
        return this.programa;
    }
}
