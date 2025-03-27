package com.maquinaturing.producto.concreto;

import com.maquinaturing.producto.abstracto.HaltChecker;
import com.maquinaturing.producto.abstracto.ProgramaPrototype;


public class ReverserPrototype extends ProgramaPrototype {

    @Override
    public void ejecutar(String cinta) {
        StringBuilder builder = new StringBuilder(cinta);
        System.out.println("Cadena invertida: " + builder.reverse());
    }

    @Override
    public ProgramaPrototype clone() {
        return new ReverserPrototype();
    }

}
