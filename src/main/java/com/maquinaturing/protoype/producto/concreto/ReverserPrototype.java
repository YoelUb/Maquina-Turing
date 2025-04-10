package com.maquinaturing.protoype.producto.concreto;

import com.maquinaturing.protoype.producto.abstracto.ProgramaPrototype;


public class ReverserPrototype extends ProgramaPrototype {

    public ReverserPrototype() {
        super();
    }

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
