package com.maquinaturing.builder;

import com.maquinaturing.producto.ContadorBajada;
import com.maquinaturing.producto.Programa;

public class ContadorBajadaBuilder implements ProgramaBuilder {
    private ContadorBajada programa;

    public ContadorBajadaBuilder() {
        reset();
    }

    @Override
    public void reset() {
        this.programa = new ContadorBajada();
    }

    @Override
    public void configurar() {
        this.programa.setInicio(10); // ejemplo
    }

    @Override
    public Programa build() {
        return this.programa;
    }
}
